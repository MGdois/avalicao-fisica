package com.matt.avaliacao.database.respository;

import com.matt.avaliacao.database.entity.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAlunoRepository extends JpaRepository<AlunoEntity, Long> {
}
