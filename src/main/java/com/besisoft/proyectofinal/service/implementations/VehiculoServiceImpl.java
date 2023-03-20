package com.besisoft.proyectofinal.service.implementations;

import com.besisoft.proyectofinal.entity.Cliente;
import com.besisoft.proyectofinal.entity.Vehiculo;
import com.besisoft.proyectofinal.exceptions.VehiculoNotFoundException;
import com.besisoft.proyectofinal.repository.ClienteRepository;
import com.besisoft.proyectofinal.repository.VehiculoRepository;
import com.besisoft.proyectofinal.service.interfaces.VehiculoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;



@Service
@AllArgsConstructor
public class VehiculoServiceImpl implements VehiculoService {

    private VehiculoRepository vehiculoRepository;

    private ClienteRepository clienteRepository;
    @Override
    public Optional<Vehiculo> buscarPorPatente(String patente) throws VehiculoNotFoundException {
        Optional<Vehiculo>vehiculo=this.vehiculoRepository.findByPatente(patente);
        if(vehiculo.isPresent()){
            return vehiculo;
        }else {
            throw  new VehiculoNotFoundException(String.format("El vehiculo patente %s no existe",patente),null);
        }

    }

    @Override
    public Vehiculo crearVehiculo(Vehiculo vehiculo) {
        return this.vehiculoRepository.save(vehiculo);
    }

    @Override
    public List<Vehiculo> listarVehiculos() {
        return (List<Vehiculo>) this.vehiculoRepository.findAll();
    }

    @Override
    public Vehiculo actualizarVehiculo(Vehiculo vehiculo,String patente)throws VehiculoNotFoundException {

        Optional<Vehiculo>stored=this.vehiculoRepository.findByPatente(patente);
         if(stored.isPresent()){
             return this.vehiculoRepository.save(vehiculo);
         }else{
             throw  new VehiculoNotFoundException("No existe un vehiculo con patente "+vehiculo.getPatente(),null);
         }

    }

    @Override
    @Transactional
    public Vehiculo verificarDatos(Vehiculo vehiculo) {
        Optional<Vehiculo>vehiculoInBD=this.vehiculoRepository.findByPatente(vehiculo.getPatente());
        Vehiculo v= new Vehiculo();
        if(vehiculoInBD.isPresent()){
            List<String> emails=vehiculoInBD.get().getClientes()
                    .stream().map(c->c.getCorreoElectronico()).collect(Collectors.toList());
            if(emails.contains(vehiculo.getClientes().get(0).getCorreoElectronico())){
                v= vehiculoInBD.get();
            }
        }else{
            Optional<Cliente>clienteStored=clienteRepository
                    .findByCorreoElectronico( vehiculo.getClientes().get(0).getCorreoElectronico());
            if(clienteStored.isPresent()){
                Vehiculo nuevo=this.vehiculoRepository.save(vehiculo);
                nuevo.getClientes().add(clienteStored.get());
                v= this.vehiculoRepository.save(nuevo);
            }else{
                /*vehiculo tiene cascade persist en cliente*/
                Cliente clienteNew=clienteRepository.save(vehiculo.getClientes().get(0));
                Vehiculo vehiculoNew=vehiculoRepository.save(vehiculo);
                v= vehiculoNew;
            }
        }
        return v;
    }


}
