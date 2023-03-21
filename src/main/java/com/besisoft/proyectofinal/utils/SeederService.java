package com.besisoft.proyectofinal.utils;

import com.besisoft.proyectofinal.entity.Cliente;
import com.besisoft.proyectofinal.entity.Domicilio;
import com.besisoft.proyectofinal.entity.Vehiculo;
import com.besisoft.proyectofinal.repository.ClienteRepository;
import com.besisoft.proyectofinal.repository.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class SeederService {

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    VehiculoRepository vehiculoRepository;


    @EventListener
    public void seed(ContextRefreshedEvent event){
        Cliente cliente=Cliente.builder()
                .id(1L)
                .correoElectronico("cliente@gmail.com")
                .telefonoLinea("123456789321456")
                .nombres("Alejandro")
                .apellido("Figueroa")
                .build();


        Domicilio domicilio=Domicilio.builder()
                .calle("Los Alamos")
                .piso("")
                .codigoPostal("4400")
                .numero("254")
                .localidad("San Lorenzo")
                .departamento("Capital")
                .celular("3876852369")
                .build();
        cliente.setDomicilio(domicilio);
        clienteRepository.save(cliente);
        Vehiculo vehiculo=Vehiculo.builder()
                .id(2L)
                .marca("chevrolet")
                .modelo("corsa")
                .anio(2015)
                .patente("123abcd")
                .color("azul")
                .build();
        vehiculoRepository.save(vehiculo);
    }




}
