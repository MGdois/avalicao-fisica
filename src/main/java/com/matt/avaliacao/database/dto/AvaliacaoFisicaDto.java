package com.matt.avaliacao.database.dto;


import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class AvaliacaoFisicaDto {

    @NotNull
    private Long alunoId;
    @NotNull
    private BigDecimal peso;
    @NotNull
    private BigDecimal altura;
    @NotNull
    private BigDecimal porcentagemCorporal;

}
