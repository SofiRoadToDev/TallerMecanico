package com.besisoft.proyectofinal.entity;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "clientes")
public class Cliente extends Persona{


    @Column(length = 15)
    @Length(max = 15,min=15,message = "Coloque un numero valido, de 15 digitos")
    private String telefonoLinea;



   /*@Email(message = "Ingrese el email de manera correcta")
   @NotNull(message = "El email es obligatorio")*/
    private String correoElectronico;

   @ManyToMany(mappedBy = "clientes")
    private List<Vehiculo>vehiculos=new ArrayList<>();


}
