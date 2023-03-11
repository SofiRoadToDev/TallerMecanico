package com.besisoft.proyectofinal.exceptions;

public class ClienteNotFoundException extends RuntimeException{

    public ClienteNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
