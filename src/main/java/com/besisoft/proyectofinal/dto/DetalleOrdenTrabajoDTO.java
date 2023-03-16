package com.besisoft.proyectofinal.dto;

import com.besisoft.proyectofinal.entity.OrdenTrabajo;
import com.besisoft.proyectofinal.entity.Repuesto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import java.math.BigDecimal;


@Data
@AllArgsConstructor
@Builder
public class DetalleOrdenTrabajoDTO {


    private Long id;

    private RepuestoDTO repuesto;

    private Integer cantidad;

    @Digits(integer = 17,fraction = 2)
    private BigDecimal valorTotal;
}
