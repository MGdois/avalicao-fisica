package com.matt.avaliacao.service;

import com.matt.avaliacao.database.dto.ExercicioDto;
import com.matt.avaliacao.database.entity.ExercicioEntity;
import com.matt.avaliacao.database.respository.IExerciciosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExercicioService {

    private final IExerciciosRepository exerciciosRepository;

    public List<ExercicioEntity> findAllExerc(){
        return exerciciosRepository.findAll();
    }

    public void saveExerc(ExercicioDto exercicioDto){
        ExercicioEntity exercicio =
                ExercicioEntity.builder().
                        name(exercicioDto.getNome()).grupoMuscular(exercicioDto.getGrupoMuscular()).build();

                exerciciosRepository.save(exercicio);
    }

    public List<ExercicioEntity> getAllByGrupoMuscular(String grupoMuscular){
        return exerciciosRepository.findAllByGrupoMuscular(grupoMuscular);
    }

}
