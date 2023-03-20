package com.besisoft.proyectofinal.mapper;

import com.besisoft.proyectofinal.dto.ClienteDTO;
import com.besisoft.proyectofinal.dto.DomicilioDTO;
import com.besisoft.proyectofinal.dto.VehiculoDTO;
import com.besisoft.proyectofinal.dto.VehiculoPatentesDTO;
import com.besisoft.proyectofinal.entity.Cliente;
import com.besisoft.proyectofinal.entity.Domicilio;
import com.besisoft.proyectofinal.entity.Persona;
import com.besisoft.proyectofinal.entity.Vehiculo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.SubclassMapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClienteMapper {




    Cliente mapToCliente(ClienteDTO clienteDTO);


    ClienteDTO mapToClienteDTO(Cliente cliente);

    List<ClienteDTO>mapToClienteDTOList(List<Cliente>clientes);

    List<Cliente>mapToClienteList(List<ClienteDTO>clienteDTOS);

    Domicilio mapToDomicilio(DomicilioDTO dto);
    DomicilioDTO mapToDomicilioDTO(Domicilio domicilio);

    VehiculoPatentesDTO mapToVehiculoPatenteDTO(Vehiculo vehiculo);
}
