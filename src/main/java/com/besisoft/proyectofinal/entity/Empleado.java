package com.besisoft.proyectofinal.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "empleados")
public class Empleado extends  Persona{

    private String tipoEmpleado;


    public Empleado(String tipoEmpleado,String apellido) {
        super(apellido);
        this.tipoEmpleado = tipoEmpleado;
    }
}


