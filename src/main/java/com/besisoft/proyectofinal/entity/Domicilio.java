package com.besisoft.proyectofinal.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
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
