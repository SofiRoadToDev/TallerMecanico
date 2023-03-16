package com.besisoft.proyectofinal.mapper;


import com.besisoft.proyectofinal.dto.DetalleOrdenTrabajoDTO;
import com.besisoft.proyectofinal.dto.ManoDeObraDTO;
import com.besisoft.proyectofinal.dto.OrdenTrabajoDTO;
import com.besisoft.proyectofinal.dto.VehiculoDTO;
import com.besisoft.proyectofinal.entity.DetalleOrdenTrabajo;
import com.besisoft.proyectofinal.entity.ManoDeObra;
import com.besisoft.proyectofinal.entity.OrdenTrabajo;
import com.besisoft.proyectofinal.entity.Vehiculo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OrdenTrabajoMapper {


     @Mapping(target = "fechaIngreso",source = "fechaIngreso",dateFormat = "dd/MM/yyyy")
     OrdenTrabajoDTO mapToOrdenTrabajoDTO(OrdenTrabajo ordenTrabajo);


     @Mapping(target = "fechaIngreso",source = "fechaIngreso",dateFormat = "dd/MM/yyyy")
     OrdenTrabajo mapToOrdenTrabajo(OrdenTrabajoDTO ordenTrabajoDTO);

     VehiculoDTO mapToVehiculoDTO(Vehiculo vehiculo);

     Vehiculo mapToVehiculo(VehiculoDTO vehiculoDTO);

     DetalleOrdenTrabajoDTO mapToDetalleOrdenTrabajoDTO(OrdenTrabajo ordenTrabajo);

     DetalleOrdenTrabajo mapToOrdenTrabajo(DetalleOrdenTrabajoDTO dto);

     ManoDeObraDTO mapToManoDeOBraDTO(ManoDeObra manoDeObra);

     ManoDeObra mapToManoDeObra(ManoDeObraDTO manoDeObraDTO);
}
