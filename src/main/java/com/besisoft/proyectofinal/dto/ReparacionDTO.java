package com.besisoft.proyectofinal.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class ReparacionDTO {

    private List<RepuestoDTO> repuestos;

    private Long id;


    private String detalleFallas;


    private String estado;


    private String fechaFinReparacion;



    private String fechaIngreso;

    private Integer kilometraje;

    private String nivelCombustible;


    private VehiculoPatentesDTO vehiculo;


    private List<DetalleOrdenTrabajoDTO> detalleOrdenesTrabajo=new ArrayList<>();

    @NotNull(message = "Debe proporcionarse mano de obra con el apellido del mecanico")
    private List<ManoDeObraDTO>manoDeObra=new ArrayList<>();



}
