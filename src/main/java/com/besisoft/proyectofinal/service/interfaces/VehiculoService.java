package com.besisoft.proyectofinal.service.interfaces;

import com.besisoft.proyectofinal.entity.Vehiculo;
import com.besisoft.proyectofinal.exceptions.VehiculoNotFoundException;

import java.util.Optional;

public interface VehiculoService {

    Optional<Vehiculo>buscarPorPatente(String patente)throws VehiculoNotFoundException;
}
