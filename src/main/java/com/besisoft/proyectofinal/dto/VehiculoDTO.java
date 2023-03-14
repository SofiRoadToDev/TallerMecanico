package com.besisoft.proyectofinal.dto;

import com.besisoft.proyectofinal.entity.Cliente;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class VehiculoDTO {

    private Long id;

    private String patente;


    private String modelo;

    private String marca;

    private int  anio;

    private String color;

    private List<ClienteDTO> clienteList=new ArrayList();
}
