package com.besisoft.proyectofinal.service.interfaces;

import com.besisoft.proyectofinal.entity.ManoDeObra;

import java.util.Optional;

public interface ManoDeObraService {

    Optional<ManoDeObra>buscarPorId(Long id);

    ManoDeObra crearManoDeObra(ManoDeObra manoDeObra);

    ManoDeObra actualizarManoDeObra(ManoDeObra manoDeObra,Long id);
}
