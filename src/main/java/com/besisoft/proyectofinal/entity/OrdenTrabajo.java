package com.besisoft.proyectofinal.entity;

import lombok.*;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.validation.constraints.Digits;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "ordenes_trabajo")
public class OrdenTrabajo {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer cantidadCuotas;

    private String detalleFallas;

    private String estado;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinReparacion;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPago;

    private String formaPago;
    @Digits(integer = 17,fraction = 2)
    private BigDecimal importeTotal;

    private Integer kilometraje;

    private String nivelCombustible;

    private  String tipoTarjeta;

    @ManyToOne
    @JoinColumn(name = "vehiculo_id")
    private Vehiculo vehiculo;

    @OneToMany(mappedBy = "ordenTrabajo")
    private List<ManoDeObra> manoDeObra;

    @OneToMany(mappedBy = "ordenTrabajo")
    private List<DetalleOrdenTrabajo> detalleOrdenesTrabajo;

    @ManyToOne
    private Empleado recepcionista;

    @ManyToOne
    private Empleado administrativo;


}
