package com.besisoft.proyectofinal.service.implementations;

import com.besisoft.proyectofinal.entity.Cliente;
import com.besisoft.proyectofinal.entity.Vehiculo;
import com.besisoft.proyectofinal.exceptions.VehiculoNotFoundException;
import com.besisoft.proyectofinal.repository.ClienteRepository;
import com.besisoft.proyectofinal.repository.VehiculoRepository;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
class VehiculoServiceImplTest {

    @MockBean
    private VehiculoRepository vehiculoRepository;

    @MockBean
    private ClienteRepository clienteRepository;

    @Autowired
    private VehiculoServiceImpl vehiculoService;

    private Vehiculo vehiculo;
    private Cliente cliente;

    @BeforeEach
    void setUp() {
        vehiculoRepository=mock(VehiculoRepository.class);
        clienteRepository=mock(ClienteRepository.class);

        vehiculoService=new VehiculoServiceImpl(vehiculoRepository,clienteRepository);
        cliente = Cliente.builder()
                .nombres("Mariana")
                .apellido("Barrios")
                .id(1L)
                .correoElectronico("mariana@hotmail.com")
                .build();
        vehiculo = Vehiculo.builder()
                .patente("123abcd")
                .color("azul")
                .marca("chevrolet")
                .modelo("corsa")
                .build();
    }


    @Test
    void buscarPorPatenteDeberiaDevolverUnOptionalConElVehiculoCuandoExiste() throws VehiculoNotFoundException {

        when(vehiculoRepository.findByPatente("123abcd")).thenReturn(Optional.of(vehiculo));


        Optional<Vehiculo> result = vehiculoService.buscarPorPatente("123abcd");


        assertTrue(result.isPresent());
        assertEquals(vehiculo, result.get());
    }

    @Test
    void crearVehiculoDeberiaDevolverElVehiculoCreado() {

        when(vehiculoRepository.save(any(Vehiculo.class))).thenReturn(vehiculo);


        Vehiculo result = vehiculoService.crearVehiculo(vehiculo);


        assertNotNull(result);
        assertEquals(vehiculo, result);
    }

    @Test
    void listarVehiculosDeberiaDevolverUnaListaConLosVehiculos() {
        // GIVEN
        List<Vehiculo> vehiculos = List.of(
                Vehiculo.builder().marca("wolskwagen").modelo("gold").patente("123abcd").build(),
                Vehiculo.builder().marca("chevrolet").modelo("corsa").patente("789qwer").build()
        );
        when(vehiculoRepository.findAll()).thenReturn(vehiculos);

        // WHEN
        List<Vehiculo> result = vehiculoService.listarVehiculos();

        // THEN
        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals(vehiculos, result);
    }

    @Test
    void actualizarVehiculo_whenVehiculoExists_returnUpdatedVehiculo() throws VehiculoNotFoundException {
        // Given

        Vehiculo storedVehiculo = Vehiculo.builder().marca("Honda").modelo("Civic").patente("1478dfs").build();


        when(vehiculoRepository.findByPatente("1478dfs")).thenReturn(Optional.of(storedVehiculo));
        when(vehiculoRepository.save(any(Vehiculo.class))).thenReturn(vehiculo);

        // When
        Vehiculo updatedVehiculo = vehiculoService.actualizarVehiculo(vehiculo, "1478dfs");

        // Then
        assertEquals(updatedVehiculo, vehiculo);
    }


}