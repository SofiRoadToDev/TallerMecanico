package com.besisoft.proyectofinal.service.implementations;

import com.besisoft.proyectofinal.entity.Cliente;
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
        OrdenTrabajo ordenTrabajoFinal=new OrdenTrabajo();
        Optional<Vehiculo>vehiculoStored=this.vehiculoRepository.findByPatente(ordenTrabajo.getVehiculo().getPatente());
       /* if(vehiculoStored.isPresent()){
            List<Cliente> clientesDuenios=vehiculoStored.get().getClientes();
            List<String>emailsClientes=clientesDuenios.stream().map(
                    c->c.getCorreoElectronico()
            ).collect(Collectors.toList());

        }
        Optional<Cliente>cliente=this.clienteRepository.findByCorreoElectonico("String email");
        if(vehiculoStored.isPresent()){
            if(cliente.isPresent()){
                   ordenTrabajoFinal=ordenTrabajo;
            }else{
                clienteRepository.save(vehiculoStored.get().getClientes().get());
            }
        }*/
        return ordenTrabajoFinal;
    }

    @Override
    @Transactional
    public OrdenTrabajo actualizarOrdenDeTrabajo(OrdenTrabajo ordenTrabajo) {
        return this.ordenTrabajoRepository.save(ordenTrabajo);
    }
}
