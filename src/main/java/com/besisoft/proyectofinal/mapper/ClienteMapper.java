package com.besisoft.proyectofinal.mapper;

import com.besisoft.proyectofinal.dto.ClienteDTO;
import com.besisoft.proyectofinal.dto.VehiculoDTO;
import com.besisoft.proyectofinal.dto.VehiculoPatentesDTO;
import com.besisoft.proyectofinal.entity.Cliente;
import com.besisoft.proyectofinal.entity.Vehiculo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface ClienteMapper {

    @Mapping(source = "email",target = "correoElectronico")
    Cliente mapToCliente(ClienteDTO clienteDTO);

    @Mapping(source = "correoElectronico",target = "email")
    ClienteDTO mapToClienteDTO(Cliente cliente);

    VehiculoPatentesDTO mapToVehiculoPatenteDTO(Vehiculo vehiculo);
}
