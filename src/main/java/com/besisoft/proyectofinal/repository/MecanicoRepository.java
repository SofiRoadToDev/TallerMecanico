package com.besisoft.proyectofinal.repository;

import com.besisoft.proyectofinal.entity.Mecanico;
import org.springframework.data.repository.reactive.RxJava2CrudRepository;

public interface MecanicoRepository extends RxJava2CrudRepository<Mecanico,Long> {
}
