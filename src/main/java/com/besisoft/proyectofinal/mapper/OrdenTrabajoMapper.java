package com.besisoft.proyectofinal.mapper;

import com.besisoft.proyectofinal.dto.OrdenTrabajoDTO;
import com.besisoft.proyectofinal.entity.Empleado;
import com.besisoft.proyectofinal.entity.OrdenTrabajo;
import com.besisoft.proyectofinal.entity.Vehiculo;

public class OrdenTrabajoMapper {



    public static OrdenTrabajo mapToOrdenTrabajo(OrdenTrabajoDTO dto){
        OrdenTrabajo orden=new OrdenTrabajo();
        if(dto.getPatenteVehiculo()!=null){
            orden.setVehiculo(new Vehiculo(dto.getPatenteVehiculo()));
        }
        if(dto.getApellidoRecepcionista()!=null){
            orden.setRecepcionista(new Empleado("Recepcionista",dto.getApellidoRecepcionista()));
        }
        return orden;
    }
}
