package com.besisoft.proyectofinal.mapper;

import com.besisoft.proyectofinal.dto.ClienteDTO;
import com.besisoft.proyectofinal.dto.DomicilioDTO;
import com.besisoft.proyectofinal.dto.VehiculoDTO;
import com.besisoft.proyectofinal.entity.Cliente;
import com.besisoft.proyectofinal.entity.Domicilio;
import com.besisoft.proyectofinal.entity.Vehiculo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VehiculoMapper {

    Vehiculo mapToVehiculo(VehiculoDTO vehiculoDTO);

    VehiculoDTO mapToVehiculoDTO(Vehiculo vehiculo);

    List<VehiculoDTO>mapToListVehiculoDTO(List<Vehiculo> vehiculos);
    List<Vehiculo>mapToListVehiculo(List<VehiculoDTO> vehiculosDTO);

    Cliente mapToCliente(ClienteDTO clienteDTO);

    ClienteDTO mapToClienteDTO(Cliente cliente);


}
