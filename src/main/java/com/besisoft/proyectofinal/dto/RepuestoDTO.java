package com.besisoft.proyectofinal.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Digits;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class RepuestoDTO {

    private Long id;


    private String marca;

    private String modelo;

    private String repuesto;


    @Digits(integer = 17,fraction = 2)
    private BigDecimal valor;
}
