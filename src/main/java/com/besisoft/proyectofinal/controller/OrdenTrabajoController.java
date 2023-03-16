package com.besisoft.proyectofinal.controller;

import com.besisoft.proyectofinal.dto.OrdenTrabajoDTO;
import com.besisoft.proyectofinal.mapper.OrdenTrabajoMapper;
import com.besisoft.proyectofinal.service.interfaces.OrdenDeTrabajoService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.ParseException;
import java.util.Map;
import java.util.TreeMap;

@RestController
@AllArgsConstructor
@Log4j2
@RequestMapping("/api/v1/ordenesTrabajo")
public class OrdenTrabajoController {


    private OrdenDeTrabajoService service;
    private OrdenTrabajoMapper mapper;
    @PostMapping()
    private ResponseEntity<?> crearOrdenTrabajo(@Valid @RequestBody OrdenTrabajoDTO ordenTrabajoDTO, BindingResult bindingResult){
        Map<String,String> errors=new TreeMap<>();
        if(bindingResult.hasErrors()){

            bindingResult.getAllErrors().forEach(
                    e->errors.put(e.getObjectName(),e.getDefaultMessage())
            );
            return  ResponseEntity.badRequest().body(errors);
        }else{
            return ResponseEntity.ok().body(service.crearOrdenDeTrabajo(mapper.mapToOrdenTrabajo(ordenTrabajoDTO)));
        }

    }
}
