package com.besisoft.proyectofinal.mapper;

import com.besisoft.proyectofinal.dto.VehiculoDTO;
import com.besisoft.proyectofinal.entity.Vehiculo;

import java.util.stream.Collectors;

public class VehiculoMapper {

    public static VehiculoDTO mapToDtoVehiculo(Vehiculo vehiculo){
        VehiculoDTO dto= new VehiculoDTO();
        if(vehiculo.getId()!=null){
            dto.setId(vehiculo.getId());
        }
        dto.setAnio(vehiculo.getAnio());
        dto.setModelo(vehiculo.getModelo());
        dto.setMarca(vehiculo.getMarca());
        dto.setColor(vehiculo.getColor());
        dto.setPatente(vehiculo.getPatente());
        dto.setClienteList(vehiculo.getClientes().stream().map(ClienteMapper::mapToClienteDTO).collect(Collectors.toList()));
        return dto;
    }
}
