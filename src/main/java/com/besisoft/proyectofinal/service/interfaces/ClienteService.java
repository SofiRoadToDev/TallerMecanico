package com.besisoft.proyectofinal.service.interfaces;

import com.besisoft.proyectofinal.entity.Cliente;
import com.besisoft.proyectofinal.exceptions.ClienteAlreadyExistsException;
import com.besisoft.proyectofinal.exceptions.ClienteNotFoundException;

import java.util.Optional;

public interface ClienteService {

    Optional<Cliente>obtenerPorEmail(String email) throws ClienteNotFoundException;

    Cliente crearCliente(Cliente cliente)throws ClienteAlreadyExistsException;

    Cliente actualizarCliente(Cliente cliente, Long id)throws ClienteNotFoundException;


}
