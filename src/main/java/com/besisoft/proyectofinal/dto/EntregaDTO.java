package com.besisoft.proyectofinal.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
public class EntregaDTO {

    private Long id;

    private BigDecimal importeTotal;

    private String estado;
}
