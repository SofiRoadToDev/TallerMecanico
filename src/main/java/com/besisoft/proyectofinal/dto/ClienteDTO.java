package com.besisoft.proyectofinal.dto;

import com.besisoft.proyectofinal.entity.Cliente;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class ClienteDTO {

 private Long id;


 @Length(max=100,message = "El maximo de caracteres es 80")
 @NotBlank(message = "El apellido es obligatorio")
 private String apellido;

 @Length(max = 15,min=15,message = "Coloque un numero valido, de 15 digitos")
 private String telefonoLinea;
 @Length(max=100,message = "El maximo de caracteres es 100")
 @NotBlank(message = "El nombre es obligatorio")
 private String nombres;

 @Email(message = "Ingrese el email de manera correcta")
 @NotBlank(message = "El email es obligatorio")
 @NotNull
 private String correoElectronico;

 private DomicilioDTO domicilio;

 private List<VehiculoPatentesDTO> vehiculos=new ArrayList<>();
}
