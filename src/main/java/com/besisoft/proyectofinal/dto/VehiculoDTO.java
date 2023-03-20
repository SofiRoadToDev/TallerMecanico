package com.besisoft.proyectofinal.dto;

import com.besisoft.proyectofinal.entity.Cliente;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VehiculoDTO {

    private Long id;

    private String patente;


    private String modelo;

    private String marca;


    private int  anio;

    private String color;

    private List<ClienteDTO> clientes=new ArrayList();

}
