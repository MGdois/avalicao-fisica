package com.matt.avaliacao.controller;

import com.matt.avaliacao.database.dto.ExercicioDto;
import com.matt.avaliacao.database.entity.ExercicioEntity;
import com.matt.avaliacao.service.ExercicioService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Validated
@RequestMapping("/v1/exercicios")
public class ExercicioController {

    private final ExercicioService exercicioService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ExercicioEntity> exercicioEntityList(){
        return exercicioService.findAllExerc();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveExercicio(@Valid @RequestBody ExercicioDto exercicio){
        exercicioService.saveExerc(exercicio);
    }

    @GetMapping("/grupos/{grupoMuscular}")
    @ResponseStatus(HttpStatus.OK)
    public List<ExercicioEntity> listAllByGrupoMuscular(@PathVariable String grupoMuscular){
        return exercicioService.getAllByGrupoMuscular(grupoMuscular);
    }

}
