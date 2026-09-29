package com.matt.avaliacao.database.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ExercicioDto {

    @NotBlank
    private String nome;
    @NotBlank
    private String grupoMuscular;
}
