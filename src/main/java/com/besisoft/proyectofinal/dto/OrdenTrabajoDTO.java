package com.besisoft.proyectofinal.dto;

import com.besisoft.proyectofinal.entity.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class OrdenTrabajoDTO {

    private Long id;
    private Integer cantidadCuotas;

    private String detalleFallas;


    private EstadoOrdenTrabajo estado;


    private String fechaFinReparacion;


    private String fechaIngreso;


    private Date fechaPago;

    private String formaPago;

    private double importeTotal;

    private Integer kilometraje;

    private String nivelCombustible;

    private  String tipoTarjeta;


    private VehiculoDTO vehiculo;


    private String mecanicoApellido;

    private List<DetalleOrdenTrabajoDTO> detalleOrdenesTrabajo;


    private String apellidoRecepcionista;


    private String  apellidoAdministrativo;


}
