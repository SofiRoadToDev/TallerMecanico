package com.besisoft.proyectofinal.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Getter
@Data
@Table(name = "mecanicos")
public class Mecanico extends Persona{

    private Character activo;

    private String especialidad;
    @OneToMany(mappedBy = "mecanico")
    private List<ManoDeObra> manoDeObra;



}
