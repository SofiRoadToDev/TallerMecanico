package com.besisoft.proyectofinal.service.implementations;

import com.besisoft.proyectofinal.entity.Cliente;
import com.besisoft.proyectofinal.entity.EstadoOrdenTrabajo;
import com.besisoft.proyectofinal.entity.OrdenTrabajo;
import com.besisoft.proyectofinal.entity.Vehiculo;
import com.besisoft.proyectofinal.exceptions.OrdenDeTrabajoNotFoundException;
import com.besisoft.proyectofinal.repository.ClienteRepository;
import com.besisoft.proyectofinal.repository.OrdenTrabajoRepository;
import com.besisoft.proyectofinal.repository.VehiculoRepository;
import com.besisoft.proyectofinal.service.interfaces.ClienteService;
import com.besisoft.proyectofinal.service.interfaces.OrdenDeTrabajoService;
import com.besisoft.proyectofinal.service.interfaces.VehiculoService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Log4j2
@AllArgsConstructor
public class OrdenDeTrabajoServiceImpl implements OrdenDeTrabajoService {

    private OrdenTrabajoRepository ordenTrabajoRepository;

    @Override
    public Optional<OrdenTrabajo> buscarPorId(Long id) {
        return this.ordenTrabajoRepository.findById(id);
    }

    @Override
    @Transactional
    public OrdenTrabajo crearOrdenDeTrabajo(OrdenTrabajo ordenTrabajo) {
        return this.ordenTrabajoRepository.save(ordenTrabajo);
    }




    @Override
    @Transactional
    //Aqui debo modificar la orden guardadda con los atributos nuevos q lleguen. Actualizar se usa en ca da endpoint y llegan datos parciales.
    public OrdenTrabajo actualizarOrdenDeTrabajo(OrdenTrabajo ordenTrabajo,Long id) throws OrdenDeTrabajoNotFoundException{
        Optional<OrdenTrabajo>orden=this.ordenTrabajoRepository.findById(id);

        if(orden.isPresent()){
            return this.ordenTrabajoRepository.save(ordenTrabajo);
        }else{
            throw new OrdenDeTrabajoNotFoundException(String.format("no se encuentra la orden de trabajo id: %s",id),null);
        }

    }

    @Override
    public OrdenTrabajo cerrarOrdenDeTrabajo(Long id) {
        Optional<OrdenTrabajo>orden=this.ordenTrabajoRepository.findById(id);
        if(orden.isPresent()){
            orden.get().setEstado(EstadoOrdenTrabajo.CERRADA);
            return this.ordenTrabajoRepository.save(orden.get());
        }else{
            throw new OrdenDeTrabajoNotFoundException(String.format("no se encuentra la orden de trabajo id: %s",id),null);
        }
    }


}
