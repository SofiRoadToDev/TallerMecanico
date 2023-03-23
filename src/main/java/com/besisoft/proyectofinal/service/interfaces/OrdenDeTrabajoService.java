package com.besisoft.proyectofinal.service.interfaces;

import com.besisoft.proyectofinal.entity.OrdenTrabajo;

import java.util.Optional;

public interface OrdenDeTrabajoService {

    Optional<OrdenTrabajo>buscarPorId(Long id);

    OrdenTrabajo crearOrdenDeTrabajo(OrdenTrabajo ordenTrabajo);

    OrdenTrabajo iniciarReparacion(OrdenTrabajo ordenTrabajo, Long id);

    OrdenTrabajo facturacion(OrdenTrabajo ordenTrabajo, Long id);

    OrdenTrabajo finalizarReparacion(Long id);

    OrdenTrabajo cerrarOrdenDeTrabajo(Long id);
}
