package com.besisoft.proyectofinal.controller;

import com.besisoft.proyectofinal.dto.ClienteDTO;
import com.besisoft.proyectofinal.mapper.ClienteMapper;
import com.besisoft.proyectofinal.service.interfaces.ClienteService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@RestController
@Log4j2
@RequestMapping("/api/v1/clientes")
@AllArgsConstructor
public class ClienteController {

    private ClienteMapper clienteMapper;
    private ClienteService clienteService;
    @PostMapping()
    public ResponseEntity<?> crearCliente(@RequestBody @Valid ClienteDTO clienteDTO){

        return new ResponseEntity<>(clienteMapper.mapToClienteDTO
                (this.clienteService.crearCliente(clienteMapper.mapToCliente(clienteDTO))), HttpStatus.CREATED);
    }

    @GetMapping()
    public List<ClienteDTO> listarClientes(){
        return clienteMapper.mapToClienteDTOList(this.clienteService.obtenerClientes());
    }
}
