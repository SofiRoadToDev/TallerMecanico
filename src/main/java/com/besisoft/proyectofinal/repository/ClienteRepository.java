package com.besisoft.proyectofinal.repository;

import com.besisoft.proyectofinal.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ClienteRepository extends CrudRepository<Cliente,Long> {

    Optional<Cliente> findByCorreoElectronico(String email);
}
