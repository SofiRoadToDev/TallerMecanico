package com.besisoft.proyectofinal.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
public class ManoDeObraSoloMecanicoDTO {

    private MecanicoOrdenTrabajoDTO mecanico;
}
