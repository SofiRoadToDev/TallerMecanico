package com.besisoft.proyectofinal.service.implementations;

import com.besisoft.proyectofinal.entity.Vehiculo;
import com.besisoft.proyectofinal.exceptions.VehiculoNotFoundException;
import com.besisoft.proyectofinal.repository.VehiculoRepository;
import com.besisoft.proyectofinal.service.interfaces.VehiculoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class VehiculoServiceImpl implements VehiculoService {

    private VehiculoRepository vehiculoRepository;
    @Override
    public Optional<Vehiculo> buscarPorPatente(String patente) throws VehiculoNotFoundException {
        Optional<Vehiculo>vehiculo=this.vehiculoRepository.findByPatente(patente);
        if(vehiculo.isPresent()){
            return vehiculo;
        }else {
            throw  new VehiculoNotFoundException(String.format("El vehiculo patente %s no existe",patente),null);
        }

    }
}
