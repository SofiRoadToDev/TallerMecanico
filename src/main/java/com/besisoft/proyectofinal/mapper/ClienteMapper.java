package com.besisoft.proyectofinal.mapper;

import com.besisoft.proyectofinal.dto.ClienteDTO;
import com.besisoft.proyectofinal.entity.Cliente;
import com.besisoft.proyectofinal.entity.Vehiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ClienteMapper {

    public static ClienteDTO mapToClienteDTO(Cliente cliente){
        ClienteDTO dto=new ClienteDTO();
        if(cliente.getId()!=null){
            dto.setId(cliente.getId());
        }
        dto.setApellido(cliente.getApellido());
        if(cliente.getDomicilio().getCelular()!=null){
            dto.setCelular(cliente.getDomicilio().getCelular());
        }

        dto.setEmail(cliente.getCorreoElectronico());
        dto.setCalle(cliente.getDomicilio().getCalle());
        dto.setDepartamento(cliente.getDomicilio().getDepartamento());
        dto.setNumero(cliente.getDomicilio().getNumero());
        dto.setPiso(cliente.getDomicilio().getPiso());
        List<String> vehiculos=cliente.getVehiculos().stream().map(
            v->v.getPatente()
        ).collect(Collectors.toList());
        dto.setVehiculos(vehiculos);
        return dto;
    }


    public static Cliente mapToCliente(ClienteDTO dto){
        Cliente cliente=new Cliente();
        cliente.setId(dto.getId());
        cliente.setApellido(dto.getApellido());
        cliente.setNombres(dto.getNombre());
        cliente.setCorreoElectronico(dto.getEmail());
        List<Vehiculo>vehiculos=new ArrayList<>();
        /*El cliente se dara de alta con o sin lista de vehiculos*/
        return cliente;
    }
}
