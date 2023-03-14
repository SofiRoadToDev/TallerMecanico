package com.besisoft.proyectofinal.controller;

import com.besisoft.proyectofinal.dto.OrdenTrabajoDTO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Log4j2
@RequestMapping(name = "ordenesTrabajo")
public class OrdenTrabajoController {



    @PostMapping()

    private ResponseEntity<?> crearOrdenTrabajo(OrdenTrabajoDTO ordenTrabajoDTO){

        return null;
    }
}
