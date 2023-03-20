package com.besisoft.proyectofinal.dto;

import com.besisoft.proyectofinal.entity.Mecanico;
import com.besisoft.proyectofinal.entity.OrdenTrabajo;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class ManoDeObraDTO {

    private Long id;



    private Integer duracionHs;


    private MecanicoDTO mecanico;

    private String detalle;

}
