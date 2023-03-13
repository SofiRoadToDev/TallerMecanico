package com.besisoft.proyectofinal.dto;

import com.besisoft.proyectofinal.entity.Cliente;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ClienteDTO {

 private Long id;

 private String apellido;

 private String nombre;

 private String email;

 private String celular;

 private String calle;

 private String localidad;

 private String departamento;

 private String numero;

 private String piso;

 private List<String> vehiculos=new ArrayList<>();
}
