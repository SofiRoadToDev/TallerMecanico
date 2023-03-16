package com.besisoft.proyectofinal.mapper;

import com.besisoft.proyectofinal.dto.RepuestoDTO;
import com.besisoft.proyectofinal.entity.Repuesto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RepuestoMapper {

    Repuesto mapToRepuesto(RepuestoDTO repuestoDTO);
    RepuestoDTO mapToRepuestoDTO(RepuestoDTO repuestoDTO);
}
