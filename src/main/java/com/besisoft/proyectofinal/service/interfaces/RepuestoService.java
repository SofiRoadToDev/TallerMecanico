package com.besisoft.proyectofinal.service.interfaces;

import com.besisoft.proyectofinal.entity.Repuesto;

import java.util.Optional;

public interface RepuestoService {

    Optional<Repuesto>buscarPorId(Long id);

    Iterable<Repuesto>verRepuestos();
}
