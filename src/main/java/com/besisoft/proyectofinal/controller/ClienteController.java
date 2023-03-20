package com.besisoft.proyectofinal.controller;

import com.besisoft.proyectofinal.dto.ClienteDTO;
import com.besisoft.proyectofinal.mapper.ClienteMapper;
import com.besisoft.proyectofinal.service.interfaces.ClienteService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Log4j2
@RequestMapping("/api/v1/clientes")
@AllArgsConstructor
public class ClienteController {

    private ClienteMapper clienteMapper;
    private ClienteService clienteService;
    @PostMapping()
    public ClienteDTO crearCliente(@RequestBody ClienteDTO clienteDTO){
        return clienteMapper.mapToClienteDTO(this.clienteService.crearCliente(clienteMapper.mapToCliente(clienteDTO)));
    }

    @GetMapping()
    public List<ClienteDTO> listarClientes(){
        return clienteMapper.mapToClienteDTOList(this.clienteService.obtenerClientes());
    }
}
