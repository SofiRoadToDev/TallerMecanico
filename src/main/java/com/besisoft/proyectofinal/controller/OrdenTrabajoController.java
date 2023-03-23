package com.besisoft.proyectofinal.controller;

import com.besisoft.proyectofinal.dto.FacturacionDTO;
import com.besisoft.proyectofinal.dto.OrdenTrabajoDTO;
import com.besisoft.proyectofinal.dto.ReparacionDTO;
import com.besisoft.proyectofinal.entity.OrdenTrabajo;
import com.besisoft.proyectofinal.mapper.OrdenTrabajoMapper;
import com.besisoft.proyectofinal.service.interfaces.OrdenDeTrabajoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/ordenesdetrabajo")
@AllArgsConstructor
public class OrdenTrabajoController {

    private OrdenDeTrabajoService ordenDeTrabajoService;
    private OrdenTrabajoMapper ordenTrabajoMapper;

    @PostMapping()
    public ResponseEntity<?>crearOrdenTrabajo(@RequestBody OrdenTrabajoDTO ordenTrabajoDTO){
        return ResponseEntity.ok().body(ordenTrabajoMapper
                .mapToOrdenTrabajoDTO
                        (this.ordenDeTrabajoService.crearOrdenDeTrabajo(ordenTrabajoMapper.mapToOrdenTrabajo(ordenTrabajoDTO))));
    }

    @PutMapping("/reparacion/{id}")
    public ResponseEntity<?>actualizarOrdenTrabajo(@RequestBody ReparacionDTO reparacionDTO, Long id){
        return ResponseEntity.ok(ordenTrabajoMapper.mapToReparacionDTO(this.ordenDeTrabajoService
                .actualizarOrdenDeTrabajo(ordenTrabajoMapper.mapToOrdenTrabajoFromReparacion(reparacionDTO),id)));
    }

    @PutMapping("/facturacion/{id}")
    public ResponseEntity<?>crearFactura(@RequestBody FacturacionDTO facturacionDTO, Long id){
        return ResponseEntity.ok(ordenTrabajoMapper.mapToFacturacionDTO(this.ordenDeTrabajoService
                .actualizarOrdenDeTrabajo(ordenTrabajoMapper.mapToOrdenTrabajoFromFacturacion(facturacionDTO),id)));
    }

    @PutMapping("/entrega/{id}")
    public ResponseEntity<?>cerrarOrdenDeTrabajo(@RequestBody OrdenTrabajoDTO ordenTrabajoDTO,Long id){
        return ResponseEntity.ok(ordenTrabajoMapper.mapToOrdenTrabajoDTO(this.ordenDeTrabajoService
                .actualizarOrdenDeTrabajo(ordenTrabajoMapper.mapToOrdenTrabajo(ordenTrabajoDTO),id)));
    }
}
