package com.besisoft.proyectofinal.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class MecanicoDTO {



    private Character activo;

    private String especialidad;

    private String apellido;

    private  String nombres;
}