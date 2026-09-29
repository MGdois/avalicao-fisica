package com.matt.avaliacao.database.respository;

import com.matt.avaliacao.database.entity.TreinoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITreinoRepository extends JpaRepository<TreinoEntity, Long> {
}
