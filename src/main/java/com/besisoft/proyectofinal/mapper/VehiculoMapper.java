package com.besisoft.proyectofinal.mapper;

import com.besisoft.proyectofinal.dto.ClienteDTO;
import com.besisoft.proyectofinal.dto.VehiculoDTO;
import com.besisoft.proyectofinal.entity.Cliente;
import com.besisoft.proyectofinal.entity.Vehiculo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VehiculoMapper {

    Vehiculo mapToVehiculo(VehiculoDTO vehiculoDTO);

    VehiculoDTO mapToVehiculoDTO(Vehiculo vehiculo);

    Cliente mapToCliente(ClienteDTO clienteDTO);

    ClienteDTO mapToClienteDTO(Cliente cliente);
}
