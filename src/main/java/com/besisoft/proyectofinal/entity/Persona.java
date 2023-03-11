package com.besisoft.proyectofinal.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@MappedSuperclass
public abstract class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private  Domicilio domicilio;

    @Column(length =80 )
    @Length(max=100,message = "El maximo de caracteres es 80")
    @NotBlank(message = "El apellido es obligatorio")
    private String apellido;

    @Column(length = 100)
    @Length(max=100,message = "El maximo de caracteres es 100")
    @NotBlank(message = "El nombre es obligatorio")
    private String nombres;

}
