package com.besisoft.proyectofinal.service.interfaces;

import com.besisoft.proyectofinal.entity.Vehiculo;
import com.besisoft.proyectofinal.exceptions.VehiculoNotFoundException;

import java.util.List;
import java.util.Optional;

public interface VehiculoService {

    Optional<Vehiculo>buscarPorPatente(String patente)throws VehiculoNotFoundException;
    Vehiculo crearVehiculo(Vehiculo vehiculo);

    List<Vehiculo> listarVehiculos();
    Vehiculo actualizarVehiculo(Vehiculo vehiculo,String patente)throws VehiculoNotFoundException;

    Vehiculo verificarDatos(Vehiculo vehiculo);
}
