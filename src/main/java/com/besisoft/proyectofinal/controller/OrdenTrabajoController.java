package com.besisoft.proyectofinal.controller;

import com.besisoft.proyectofinal.dto.OrdenTrabajoDTO;
import com.besisoft.proyectofinal.mapper.OrdenTrabajoMapper;
import com.besisoft.proyectofinal.service.interfaces.OrdenDeTrabajoService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@AllArgsConstructor
@Log4j2
@RequestMapping(name = "/api/v1/ordenesTrabajo")
public class OrdenTrabajoController {


    private OrdenDeTrabajoService service;
    private OrdenTrabajoMapper mapper;
    @PostMapping()
    private ResponseEntity<?> crearOrdenTrabajo(OrdenTrabajoDTO ordenTrabajoDTO){
            return ResponseEntity.ok(service.crearOrdenDeTrabajo(mapper.mapToOrdenTrabajo(ordenTrabajoDTO)));
    }
}
