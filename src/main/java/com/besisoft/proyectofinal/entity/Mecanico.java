package com.besisoft.proyectofinal.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "mecanicos")
public class Mecanico extends Persona{

    private Character activo;

    private String especialidad;
}
