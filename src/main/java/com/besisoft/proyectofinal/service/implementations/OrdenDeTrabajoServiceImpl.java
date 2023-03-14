package com.besisoft.proyectofinal.service.implementations;

import com.besisoft.proyectofinal.entity.Cliente;
import com.besisoft.proyectofinal.entity.EstadoOrdenTrabajo;
import com.besisoft.proyectofinal.entity.OrdenTrabajo;
import com.besisoft.proyectofinal.entity.Vehiculo;
import com.besisoft.proyectofinal.repository.ClienteRepository;
import com.besisoft.proyectofinal.repository.OrdenTrabajoRepository;
import com.besisoft.proyectofinal.repository.VehiculoRepository;
import com.besisoft.proyectofinal.service.interfaces.ClienteService;
import com.besisoft.proyectofinal.service.interfaces.OrdenDeTrabajoService;
import com.besisoft.proyectofinal.service.interfaces.VehiculoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class OrdenDeTrabajoServiceImpl implements OrdenDeTrabajoService {

    private OrdenTrabajoRepository ordenTrabajoRepository;

    private ClienteRepository clienteRepository;

    private VehiculoRepository vehiculoRepository;
    @Override
    public Optional<OrdenTrabajo> buscarPorId(Long id) {
        return this.ordenTrabajoRepository.findById(id);
    }

    @Override
    @Transactional

    public OrdenTrabajo crearOrdenDeTrabajo(OrdenTrabajo ordenTrabajo) {
        /*Suponiendo que el frontend presenta una lista con los mecánicos y se envía éste*/
        OrdenTrabajo ordenTrabajoFinal=new OrdenTrabajo();
        Optional<Vehiculo>vehiculoStored=this.vehiculoRepository.findByPatente(ordenTrabajo.getVehiculo().getPatente());
        if(vehiculoStored.isPresent()){/*El vehiculo esta registrado*/
            List<Cliente> clientesDuenios=vehiculoStored.get().getClientes();
            List<String>emailsClientes=clientesDuenios.stream().map(
                    c->c.getCorreoElectronico()
            ).collect(Collectors.toList());
            String emailDelClientequeLlega=ordenTrabajo.getVehiculo().getClientes().get(0).getCorreoElectronico();
            if(emailsClientes.contains(emailDelClientequeLlega)){/*El cliente también está registrado*/
                ordenTrabajoFinal=memoryToBeStored(ordenTrabajo);
                ordenTrabajoFinal.setVehiculo(vehiculoStored.get());
                ordenTrabajoRepository.save(ordenTrabajoFinal);

            }else{/*Esta registrado el vehiculo pero no el cliente*/
                ordenTrabajoFinal=memoryToBeStored(ordenTrabajo);
                Cliente nuevoCliente=clienteRepository.save(ordenTrabajo.getVehiculo().getClientes().get(0));
                vehiculoStored.get().getClientes().add(clienteRepository.save(nuevoCliente));
                vehiculoRepository.save(vehiculoStored.get());
                ordenTrabajoFinal.setVehiculo(vehiculoStored.get());
                ordenTrabajoRepository.save(ordenTrabajoFinal);
            }

        }/*No está registrado el vehiculo*/
        else{
            Cliente cliente=ordenTrabajo.getVehiculo().getClientes().get(0);
            Optional<Cliente> clienteStored=clienteRepository.findByCorreoElectronico(cliente.getCorreoElectronico());
            if(clienteStored.isPresent()){/*No vehiculo si cliente*/
                Vehiculo nuevoVehiculo=vehiculoRepository.save(ordenTrabajo.getVehiculo());
                clienteStored.get().getVehiculos().add(nuevoVehiculo);
                clienteRepository.save(clienteStored.get());
                ordenTrabajoFinal=memoryToBeStored(ordenTrabajo);
                ordenTrabajoFinal.setVehiculo(nuevoVehiculo);
                ordenTrabajoRepository.save(ordenTrabajoFinal);
            }else{/*ni vehiculo ni cliente*/
                Vehiculo nuevoVehiculo=vehiculoRepository.save(ordenTrabajo.getVehiculo());
                Cliente nuevoCliente=ordenTrabajo.getVehiculo().getClientes().get(0);
                nuevoCliente.getVehiculos().add(nuevoVehiculo);
                clienteRepository.save(nuevoCliente);
                ordenTrabajoFinal=memoryToBeStored(ordenTrabajo);
                ordenTrabajoFinal.setVehiculo(nuevoVehiculo);
                ordenTrabajoRepository.save(ordenTrabajoFinal);
            }
        }

        return ordenTrabajoFinal;
    }


    private OrdenTrabajo memoryToBeStored(OrdenTrabajo input){
        OrdenTrabajo ordenTrabajoFinal=new OrdenTrabajo();
        ordenTrabajoFinal.setFechaIngreso(input.getFechaIngreso());
        ordenTrabajoFinal.setDetalleFallas(input.getDetalleFallas());
        ordenTrabajoFinal.setKilometraje(input.getKilometraje());
        ordenTrabajoFinal.setNivelCombustible(input.getNivelCombustible());
        ordenTrabajoFinal.setEstado(EstadoOrdenTrabajo.CREADA);
        ordenTrabajoFinal.getManoDeObra().add(input.getManoDeObra().get(0));//asigna mecánico
        return ordenTrabajoFinal;
    }

    @Override
    @Transactional
    public OrdenTrabajo actualizarOrdenDeTrabajo(OrdenTrabajo ordenTrabajo) {
        return this.ordenTrabajoRepository.save(ordenTrabajo);
    }
}
