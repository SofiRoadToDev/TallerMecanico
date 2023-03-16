package com.besisoft.proyectofinal.mapper;

import com.besisoft.proyectofinal.dto.DetalleOrdenTrabajoDTO;
import com.besisoft.proyectofinal.dto.RepuestoDTO;
import com.besisoft.proyectofinal.entity.DetalleOrdenTrabajo;
import com.besisoft.proyectofinal.entity.Repuesto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DetalleOrdenTrabajoMapper {

    DetalleOrdenTrabajo mapToDetalleOrdenTrabajo(DetalleOrdenTrabajoDTO dto);

    DetalleOrdenTrabajoDTO mapToDetalleOrdenTrabajoDTO(DetalleOrdenTrabajo orden);

    Repuesto mapToRepuesto(RepuestoDTO repuestoDTO);

    RepuestoDTO mapToRepuestoDTO(Repuesto repuesto);
}
