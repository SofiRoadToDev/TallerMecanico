package com.besisoft.proyectofinal.service.implementations;

import com.besisoft.proyectofinal.entity.Repuesto;
import com.besisoft.proyectofinal.repository.RepuestoRepository;
import com.besisoft.proyectofinal.service.interfaces.RepuestoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class RepuestoServiceImpl implements RepuestoService {

    private RepuestoRepository repuestoRepository;
    @Override
    public Optional<Repuesto> buscarPorId(Long id) {
        return this.repuestoRepository.findById(id);
    }

    @Override
    public Iterable<Repuesto> verRepuestos() {
        return this.repuestoRepository.findAll();
    }
}
