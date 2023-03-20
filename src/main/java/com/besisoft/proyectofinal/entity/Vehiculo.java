package com.besisoft.proyectofinal.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "vehiculos")
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Integer anio;

    private String color;

    private  String marca;

    private  String modelo;

    private  String patente;

    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Cliente>clientes=new ArrayList<>();


    public Vehiculo(String patente) {
        this.patente = patente;
    }
}
