package com.besisoft.proyectofinal.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ManoDeObra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Integer duracionHs;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "mecanico_id")
    private Mecanico mecanico;

    private String detalle;
    @ManyToOne
    @JoinColumn(name = "orden_trabajo_id")
    private OrdenTrabajo ordenTrabajo;
}
