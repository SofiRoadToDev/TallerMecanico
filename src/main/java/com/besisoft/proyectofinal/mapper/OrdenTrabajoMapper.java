package com.besisoft.proyectofinal.mapper;


import com.besisoft.proyectofinal.dto.*;
import com.besisoft.proyectofinal.entity.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface OrdenTrabajoMapper {



     @Mappings({
             @Mapping(target = "fechaIngreso",source = "fechaIngreso",dateFormat = "dd/MM/yyyy"),
             @Mapping(target = "apellidoAdministrativo",source = "administrativo.apellido")})
     OrdenTrabajoDTO mapToOrdenTrabajoDTO(OrdenTrabajo ordenTrabajo);


     @Mappings({
             @Mapping(target = "fechaIngreso",source = "fechaIngreso",dateFormat = "dd/MM/yyyy"),
             @Mapping(target = "administrativo.apellido",source = "apellidoAdministrativo")})
     OrdenTrabajo mapToOrdenTrabajo(OrdenTrabajoDTO ordenTrabajoDTO);

     VehiculoDTO mapToVehiculoDTO(Vehiculo vehiculo);

     Vehiculo mapToVehiculo(VehiculoDTO vehiculoDTO);

     DetalleOrdenTrabajoDTO mapToDetalleOrdenTrabajoDTO(OrdenTrabajo ordenTrabajo);

     DetalleOrdenTrabajo mapToOrdenTrabajo(DetalleOrdenTrabajoDTO dto);

     ManoDeObraDTO mapToManoDeOBraDTO(ManoDeObra manoDeObra);

     ManoDeObra mapToManoDeObra(ManoDeObraDTO manoDeObraDTO);

     Empleado mapToEmpleado(EmpleadoDTO dto);

     EmpleadoDTO  mapToEmpleadoDTO(Empleado empleado);
}
