package com.besisoft.proyectofinal.mapper;


import com.besisoft.proyectofinal.dto.DetalleOrdenTrabajoDTO;
import com.besisoft.proyectofinal.dto.OrdenTrabajoDTO;
import com.besisoft.proyectofinal.dto.VehiculoDTO;
import com.besisoft.proyectofinal.entity.DetalleOrdenTrabajo;
import com.besisoft.proyectofinal.entity.OrdenTrabajo;
import com.besisoft.proyectofinal.entity.Vehiculo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrdenTrabajoMapper {


     OrdenTrabajoDTO mapToOrdenTrabajoDTO(OrdenTrabajo ordenTrabajo);

     OrdenTrabajo mapToOrdenTrabajo(OrdenTrabajoDTO ordenTrabajoDTO);

     VehiculoDTO mapToVehiculoDTO(Vehiculo vehiculo);

     Vehiculo mapToVehiculo(VehiculoDTO vehiculoDTO);

     DetalleOrdenTrabajoDTO mapToDetalleOrdenTrabajoDTO(OrdenTrabajo ordenTrabajo);

     DetalleOrdenTrabajo mapToOrdenTrabajo(DetalleOrdenTrabajoDTO dto);
}
