package com.besisoft.proyectofinal.service;

import com.besisoft.proyectofinal.entity.Cliente;
import com.besisoft.proyectofinal.exceptions.ClienteNotFoundException;

import java.util.Optional;

public interface ClienteService {

    Optional<Cliente>obtenerPorEmail(String email) throws ClienteNotFoundException;

    Cliente crearCliente(Cliente cliente);

    Cliente actualizarCliente(Cliente cliente);


}
