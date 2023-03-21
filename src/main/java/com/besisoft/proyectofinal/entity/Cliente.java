package com.besisoft.proyectofinal.entity;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private  Domicilio domicilio;

    @Column(length =80 )
    private String apellido;

    @Column(length = 100)
    private String nombres;
    @Column(length = 15)
    @Length(max = 15,min=15,message = "Coloque un numero valido, de 15 digitos")
    private String telefonoLinea;

    private String correoElectronico;

   @ManyToMany(mappedBy = "clientes",cascade = CascadeType.MERGE)
    private List<Vehiculo>vehiculos=new ArrayList<>();


}
