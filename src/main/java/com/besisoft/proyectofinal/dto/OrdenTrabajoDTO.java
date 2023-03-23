package com.besisoft.proyectofinal.dto;

import com.besisoft.proyectofinal.entity.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class OrdenTrabajoDTO {

    private Long id;
    //private Integer cantidadCuotas;

    private String detalleFallas;


    private String estado;


    //private String fechaFinReparacion;



    private String fechaIngreso;


   // private Date fechaPago;


    //private String formaPago;


   // @Digits(integer = 17,fraction = 2)
    //private BigDecimal importeTotal;

    private Integer kilometraje;

    private String nivelCombustible;

    //private  String tipoTarjeta;


    private VehiculoPatentesDTO vehiculo;


   // private List<DetalleOrdenTrabajoDTO> detalleOrdenesTrabajo=new ArrayList<>();

    @NotNull(message = "Debe proporcionarse mano de obra con el apellido del mecanico")
    private List<ManoDeObraSoloMecanicoDTO>manoDeObra=new ArrayList<>();


    //private String apellidoRecepcionista;


   // private String  apellidoAdministrativo;


}
