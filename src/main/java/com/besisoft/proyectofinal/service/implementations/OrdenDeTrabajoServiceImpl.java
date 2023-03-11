package com.besisoft.proyectofinal.service.implementations;

import com.besisoft.proyectofinal.entity.OrdenTrabajo;
import com.besisoft.proyectofinal.repository.OrdenTrabajoRepository;
import com.besisoft.proyectofinal.service.interfaces.OrdenDeTrabajoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;
@Service
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
    public OrdenTrabajo actualizarOrdenDeTrabajo(OrdenTrabajo ordenTrabajo) {
        return this.ordenTrabajoRepository.save(ordenTrabajo);
    }
}
