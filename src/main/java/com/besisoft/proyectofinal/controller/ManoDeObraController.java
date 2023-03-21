package com.besisoft.proyectofinal.controller;


import com.besisoft.proyectofinal.dto.ManoDeObraDTO;
import com.besisoft.proyectofinal.mapper.ManoDeObraMapper;
import com.besisoft.proyectofinal.service.interfaces.ManoDeObraService;
import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/manodeobra")
public class ManoDeObraController {

    private ManoDeObraService obraService;
    private ManoDeObraMapper manoDeObraMapper;

    @PostMapping()
    public ResponseEntity<?>crearManoDeObra(ManoDeObraDTO manoDeObraDTO){
        return ResponseEntity.ok(manoDeObraMapper.mapToManoDeOBraDTO(
                this.obraService.crearManoDeObra(manoDeObraMapper.mapToManoDeObra(manoDeObraDTO))
        ));
    }


    @PutMapping("/{id}")
    public ResponseEntity<?>actualizarManoDeObra(@RequestBody ManoDeObraDTO manoDeObraDTO,@PathVariable Long id){
        return ResponseEntity.ok(manoDeObraMapper.mapToManoDeOBraDTO(
                this.obraService.actualizarManoDeObra(manoDeObraMapper.mapToManoDeObra(manoDeObraDTO),id)
        ));
    }

    @PatchMapping("/reparacion/{id}")
    public ResponseEntity<?>iniciarReparacion(@RequestBody ManoDeObraDTO manoDeObraDTO,@PathVariable Long id){
        return ResponseEntity.ok(manoDeObraMapper.mapToManoDeOBraDTO(
                this.obraService.actualizarManoDeObra(manoDeObraMapper.mapToManoDeObra(manoDeObraDTO),id)
        ));
    }


}
