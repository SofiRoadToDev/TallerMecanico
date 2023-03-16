package com.besisoft.proyectofinal.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@MappedSuperclass
@Data
@NoArgsConstructor
public abstract class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private  Domicilio domicilio;

    @Column(length =80 )
    private String apellido;

    @Column(length = 100)
    private String nombres;

    public Persona(String apellido) {
        this.apellido = apellido;
    }


}
