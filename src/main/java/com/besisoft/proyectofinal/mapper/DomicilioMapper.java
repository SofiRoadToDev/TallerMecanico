package com.besisoft.proyectofinal.mapper;

import com.besisoft.proyectofinal.dto.DomicilioDTO;
import com.besisoft.proyectofinal.entity.Domicilio;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DomicilioMapper {

    Domicilio mapToDomicilio(DomicilioDTO dto);
    DomicilioDTO mapToDomicilioDTO(Domicilio domicilio);
}
