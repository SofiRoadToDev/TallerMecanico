package com.besisoft.proyectofinal.mapper;


import com.besisoft.proyectofinal.dto.ManoDeObraDTO;
import com.besisoft.proyectofinal.dto.MecanicoDTO;
import com.besisoft.proyectofinal.entity.ManoDeObra;
import com.besisoft.proyectofinal.entity.Mecanico;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ManoDeObraMapper {

    @Mapping(source = "duracionHs",target = "duracionHs",dateFormat = "hh:mm:ss")
    ManoDeObraDTO mapToManoDeOBraDTO(ManoDeObra manoDeObra);

    @Mapping(source = "duracionHs",target = "duracionHs",dateFormat = "hh:mm:ss")
    ManoDeObra mapToManoDeObra(ManoDeObraDTO manoDeObraDTO);

    MecanicoDTO mapToMecanicoDTO(Mecanico mecanico);

    Mecanico mapToMecanico(MecanicoDTO mecanicoDTO);
}
