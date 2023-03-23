package com.besisoft.proyectofinal.dto;

import com.besisoft.proyectofinal.entity.Mecanico;
import com.besisoft.proyectofinal.entity.OrdenTrabajo;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class ManoDeObraDTO {

    private Long id;



    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private String  duracionHs;


    private MecanicoOrdenTrabajoDTO mecanico;



    private String detalle;


    public void setDuracionHs(LocalTime duracionHs) {
        this.duracionHs = duracionHs.format(DateTimeFormatter.ISO_LOCAL_TIME);
    }

    public LocalTime getDuracionHs() {
        return LocalTime.parse(this.duracionHs, DateTimeFormatter.ISO_LOCAL_TIME);
    }
}
