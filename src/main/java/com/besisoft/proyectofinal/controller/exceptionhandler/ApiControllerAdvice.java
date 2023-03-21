package com.besisoft.proyectofinal.controller.exceptionhandler;


import com.besisoft.proyectofinal.dto.ExceptionDTO;
import com.besisoft.proyectofinal.exceptions.ClienteAlreadyExistsException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice(annotations = RestController.class)
@Slf4j
public class ApiControllerAdvice {

    @ExceptionHandler
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ExceptionDTO validationsHandler(MethodArgumentNotValidException ex){
        Map<String,String> errores=new HashMap<>();
        ex.getFieldErrors().forEach(e->errores.put(e.getField(),e.getDefaultMessage()));
        return new ExceptionDTO(HttpStatus.BAD_REQUEST.value(),     "Error en validaciones",errores);
    }

    @ExceptionHandler
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ExceptionDTO clienteExistente(ClienteAlreadyExistsException e){
        return new ExceptionDTO(HttpStatus.BAD_REQUEST.value(), e.getMessage());
    }

}