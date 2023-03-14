package com.besisoft.proyectofinal.dto;

import com.besisoft.proyectofinal.entity.*;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
public class OrdenTrabajoDTO {

    private Long id;
    private Integer cantidadCuotas;

    private String detalleFallas;


    private EstadoOrdenTrabajo estado;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinReparacion;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPago;

    private String formaPago;

    private double importeTotal;

    private Integer kilometraje;

    private String nivelCombustible;

    private  String tipoTarjeta;


    private String patenteVehiculo;


    private String mecanicoApellido;

    @OneToMany(mappedBy = "ordenTrabajo")
    private List<DetalleOrdenTrabajo> detalleOrdenesTrabajo;


    private String apellidoRecepcionista;


    private String  apellidoAdministrativo;


}
