package com.besisoft.proyectofinal.controller;

import com.besisoft.proyectofinal.dto.VehiculoDTO;
import com.besisoft.proyectofinal.entity.Vehiculo;
import com.besisoft.proyectofinal.mapper.VehiculoMapper;
import com.besisoft.proyectofinal.service.interfaces.VehiculoService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Log4j2
@RequestMapping("/api/v1/vehiculos")
public class VehiculoController {

    private VehiculoService vehiculoService;

    private VehiculoMapper vehiculoMapper;
    @PostMapping("/verificacion")
    public VehiculoDTO verificarDatosVehiculoYCliente(@RequestBody Vehiculo vehiculo){
        return vehiculoMapper.mapToVehiculoDTO(this.vehiculoService.verificarDatos(vehiculo));
    }

    @GetMapping()
    public List<VehiculoDTO> listarvehiculos(){
        return this.vehiculoMapper.mapToListVehiculoDTO(this.vehiculoService.listarVehiculos());
    }

}
