package com.besisoft.proyectofinal.exceptions;

public class VehiculoNotFoundException extends RuntimeException{

    public VehiculoNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
