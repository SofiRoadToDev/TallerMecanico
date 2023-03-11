package com.besisoft.proyectofinal.service.implementations;

import com.besisoft.proyectofinal.entity.ManoDeObra;
import com.besisoft.proyectofinal.repository.ManoDeObraRepository;
import com.besisoft.proyectofinal.service.interfaces.ManoDeObraService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;
@Service
@AllArgsConstructor
public class ManoDeObraServiceImpl implements ManoDeObraService {

    private ManoDeObraRepository manoDeObraRepository;
    @Override
    public Optional<ManoDeObra> buscarPorId(Long id) {
        return this.manoDeObraRepository.findById(id);
    }

    @Override
    @Transactional
    public ManoDeObra crearManoDeObra(ManoDeObra manoDeObra) {
        return this.manoDeObraRepository.save(manoDeObra);
    }

    @Override
    @Transactional
    public ManoDeObra actualizarManoDeObra(ManoDeObra manoDeObra,Long id) {
        Optional<ManoDeObra>stored=this.manoDeObraRepository.findById(id);
        if(stored.isPresent()){
            return this.manoDeObraRepository.save(manoDeObra);
        }else{
            throw new RuntimeException(String.format("mano de obra id %s no existe",id));
        }
    }
}
