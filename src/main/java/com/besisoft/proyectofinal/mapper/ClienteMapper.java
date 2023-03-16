package com.besisoft.proyectofinal.mapper;

import com.besisoft.proyectofinal.dto.ClienteDTO;
import com.besisoft.proyectofinal.entity.Cliente;
import org.mapstruct.Mapper;

@Mapper
public interface ClienteMapper {

    Cliente mapToCliente(ClienteDTO clienteDTO);

    ClienteDTO mapToClienteDTO(Cliente cliente);
}
