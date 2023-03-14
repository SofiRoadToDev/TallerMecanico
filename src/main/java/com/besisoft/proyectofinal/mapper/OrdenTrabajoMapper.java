package com.besisoft.proyectofinal.mapper;

import com.besisoft.proyectofinal.dto.OrdenTrabajoDTO;
import com.besisoft.proyectofinal.entity.Empleado;
import com.besisoft.proyectofinal.entity.OrdenTrabajo;
import com.besisoft.proyectofinal.entity.Vehiculo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

public class OrdenTrabajoMapper {



    public static OrdenTrabajo mapToOrdenTrabajo(OrdenTrabajoDTO dto) throws ParseException {

        SimpleDateFormat format= new SimpleDateFormat("dd/MM/YYYY");
        OrdenTrabajo orden=new OrdenTrabajo();
        if(dto.getId()!=null){
            orden.setId(dto.getId());
        }
        if(dto.getPatenteVehiculo()!=null){
            orden.setVehiculo(new Vehiculo(dto.getPatenteVehiculo()));
        }
        if(dto.getApellidoRecepcionista()!=null){
            orden.setRecepcionista(new Empleado("Recepcionista",dto.getApellidoRecepcionista()));
        }
        if(dto.getApellidoAdministrativo()!=null){
            orden.setAdministrativo(new Empleado("Administrativo",dto.getApellidoAdministrativo()));
        }
        orden.setKilometraje(dto.getKilometraje());
        orden.setNivelCombustible(dto.getNivelCombustible());
        orden.setDetalleFallas(dto.getDetalleFallas());
        orden.setFechaIngreso(format.parse(dto.getFechaIngreso()));
        if(dto.getEstado()!=null){
            orden.setEstado(dto.getEstado());
        }


        //orden.setCantidadCuotas(dto.getCantidadCuotas());
        return orden;
    }
}
