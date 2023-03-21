package com.besisoft.proyectofinal.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@AllArgsConstructor
@Data
public class ExceptionDTO {
    private int estado;
    private String mensaje;
    private Map<String, String> detalle;

    public ExceptionDTO(int estado, String mensaje) {
        this.estado = estado;
        this.mensaje = mensaje;
    }
}
