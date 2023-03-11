package com.besisoft.proyectofinal.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "repuestos")
@Entity
public class Repuesto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String marca;

    private String modelo;

    private String repuesto;

    //numeric(19,2)
    @Digits(integer = 17,fraction = 2)
    private BigDecimal valor;


}
