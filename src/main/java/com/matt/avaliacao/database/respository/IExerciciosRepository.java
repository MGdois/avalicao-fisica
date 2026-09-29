package com.matt.avaliacao.database.respository;

import com.matt.avaliacao.database.entity.ExercicioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IExerciciosRepository extends JpaRepository<ExercicioEntity, Long> {

    List<ExercicioEntity> findAllByGrupoMuscular(String grupoMuscular);
}
