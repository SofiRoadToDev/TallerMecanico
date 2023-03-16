package com.besisoft.proyectofinal.dto;

import com.besisoft.proyectofinal.entity.Cliente;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class ClienteDTO implements Serializable {

 private Long id;

 @NotBlank
 private String apellido;

@NotBlank
 private String nombre;

@Email
 private String email;

 private String celular;

 private String calle;

 private String localidad;

 private String departamento;

 private String numero;

 private String piso;

/* @JsonIgnore
 private List<VehiculoDTO> vehiculos=new ArrayList<>();*/
}
