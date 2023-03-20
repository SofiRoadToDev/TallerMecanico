package com.besisoft.proyectofinal.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Domicilio {

    private String calle;

    private String codigoPostal;

    private String departamento;

    private  String localidad;

    private String numero;

    private String piso;

    @Column(length = 15)
    private String celular;
}
