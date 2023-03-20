package com.besisoft.proyectofinal.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MecanicoDTO {



    private Character activo;

    private String especialidad;

    private String apellido;

    private  String nombres;
}
