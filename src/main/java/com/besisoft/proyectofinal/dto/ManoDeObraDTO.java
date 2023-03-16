package com.besisoft.proyectofinal.dto;

import com.besisoft.proyectofinal.entity.Mecanico;
import com.besisoft.proyectofinal.entity.OrdenTrabajo;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@Builder
@Data
public class ManoDeObraDTO {

    private Long id;


    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "hh:mm:ss")
    private Date duracionHs;


    private MecanicoDTO mecanico;

    private String detalle;

}
