package com.besisoft.proyectofinal.service.implementations;

import com.besisoft.proyectofinal.entity.Cliente;
import com.besisoft.proyectofinal.exceptions.ClienteAlreadyExistsException;
import com.besisoft.proyectofinal.exceptions.ClienteNotFoundException;
import com.besisoft.proyectofinal.repository.ClienteRepository;
import com.besisoft.proyectofinal.service.interfaces.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private ClienteRepository clienteRepository;
    @Override
    public Optional<Cliente> obtenerPorEmail(String email) throws ClienteNotFoundException {
        Optional<Cliente>cliente=this.clienteRepository.findByCorreoElectonico(email);
        if(cliente.isPresent()){
            return cliente;
        }else{
            throw new ClienteNotFoundException("El cliente buscado no existe",null);
        }

    }

    @Override
    @Transactional
    public Cliente crearCliente(Cliente cliente) throws ClienteAlreadyExistsException {
        Optional<Cliente>clienteStored=this.clienteRepository.findByCorreoElectonico(cliente.getCorreoElectronico());
        if(clienteStored.isPresent()){
            throw new ClienteAlreadyExistsException("El cliente que intenta ingresar ya existe, esta su mail registrado",null);
        }else{
            return this.clienteRepository.save(cliente);
        }

    }

    @Override
    @Transactional
    public Cliente actualizarCliente(Cliente cliente, Long id) {
        Optional<Cliente>clienteStored=clienteRepository.findById(id);
        if(clienteStored.isPresent()){
            return this.clienteRepository.save(cliente);
        }else{
            throw new ClienteNotFoundException(String.format("El cliente id %s no existe",id),null);
        }

    }
}
