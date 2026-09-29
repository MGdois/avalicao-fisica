package com.matt.avaliacao.database.respository;

import com.matt.avaliacao.database.entity.AvaliacaoFisicaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAvalicaoFisicaRepository extends JpaRepository<AvaliacaoFisicaEntity, Long> {
}
