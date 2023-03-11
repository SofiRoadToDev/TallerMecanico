package com.besisoft.proyectofinal.repository;

import com.besisoft.proyectofinal.entity.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface VehiculoRepository extends CrudRepository<Vehiculo,Long> {

    Optional<Vehiculo>findByPatente(String patente);
}
