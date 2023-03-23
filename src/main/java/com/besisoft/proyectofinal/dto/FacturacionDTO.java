package com.besisoft.proyectofinal.dto;

import com.besisoft.proyectofinal.entity.EstadoOrdenTrabajo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Digits;
import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@Builder
public class FacturacionDTO {

    private Long id;
    private Date fechaPago;

    private String formaPago;

    @Digits(integer = 17,fraction = 2)
    private BigDecimal importeTotal;

    private EmpleadoDTO recepcionista;

    private  String tipoTarjeta;

    private String estado;
    private EmpleadoDTO  administrativo;

}
