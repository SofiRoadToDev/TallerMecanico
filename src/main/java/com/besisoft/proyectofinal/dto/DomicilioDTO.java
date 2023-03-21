package com.besisoft.proyectofinal.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DomicilioDTO {
    private String calle;

    private String codigoPostal;

    private String departamento;

    private  String localidad;

    private String numero;

    private String piso;

   // @Length(max = 15)
    private String celular;
}
