package com.besisoft.proyectofinal.mapper;


import com.besisoft.proyectofinal.dto.*;
import com.besisoft.proyectofinal.entity.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface OrdenTrabajoMapper {




             @Mapping(target = "fechaIngreso",source = "fechaIngreso",dateFormat = "dd/MM/yyyy")

     OrdenTrabajoDTO mapToOrdenTrabajoDTO(OrdenTrabajo ordenTrabajo);



             @Mapping(target = "fechaIngreso",source = "fechaIngreso",dateFormat = "dd/MM/yyyy")

     OrdenTrabajo mapToOrdenTrabajo(OrdenTrabajoDTO ordenTrabajoDTO);

     VehiculoPatentesDTO mapToVehiculoPatentesDTO(Vehiculo vehiculo);

     Vehiculo mapToVehiculo(VehiculoPatentesDTO vehiculoDTO);

     DetalleOrdenTrabajoDTO mapToDetalleOrdenTrabajoDTO(OrdenTrabajo ordenTrabajo);

     DetalleOrdenTrabajo mapToOrdenTrabajo(DetalleOrdenTrabajoDTO dto);

     ManoDeObraSoloMecanicoDTO mapToManoDeOBraDTO(ManoDeObra manoDeObra);

     ManoDeObra mapToManoDeObra(ManoDeObraSoloMecanicoDTO manoDeObraDTO);

     Empleado mapToEmpleado(EmpleadoDTO dto);

     EmpleadoDTO  mapToEmpleadoDTO(Empleado empleado);

     ReparacionDTO mapToReparacionDTO(OrdenTrabajo ordenTrabajo);

     OrdenTrabajo mapToOrdenTrabajoFromReparacion(ReparacionDTO reparacionDTO);

     OrdenTrabajo mapToOrdenTrabajoFromFacturacion(FacturacionDTO facturacionDTO);

     FacturacionDTO mapToFacturacionDTO(OrdenTrabajo ordenTrabajo);


}
