package com.besisoft.proyectofinal.exceptions;

public class ClienteAlreadyExistsException extends RuntimeException{

    public ClienteAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }
}
