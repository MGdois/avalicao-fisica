package com.matt.avaliacao.service;

import com.matt.avaliacao.database.dto.AvaliacaoFisicaDto;
import com.matt.avaliacao.database.entity.AlunoEntity;
import com.matt.avaliacao.database.entity.AvaliacaoFisicaEntity;
import com.matt.avaliacao.database.respository.IAlunoRepository;
import com.matt.avaliacao.database.respository.IAvalicaoFisicaRepository;
import com.matt.avaliacao.exception.BadRequestException;
import com.matt.avaliacao.exception.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class AvaliacaoFisicaService {

    private final IAvalicaoFisicaRepository avalicaoFisicaRepository;
    private final IAlunoRepository alunoRepository;

    public void createAvaliacao(AvaliacaoFisicaDto avaliacaoFisicaDto) throws BadRequestException {

          AlunoEntity aluno = alunoRepository.findById(avaliacaoFisicaDto.getAlunoId())
                  .orElseThrow(() -> new NotFoundException("Aluno nao encontrado"));

        AvaliacaoFisicaEntity avaliacaoFisica = aluno.getAvaliacaoFisica();
        if(Objects.nonNull(avaliacaoFisica)){
            throw new BadRequestException("Avaliação já existente");
        }

        avaliacaoFisica = AvaliacaoFisicaEntity.builder()
                .peso(avaliacaoFisicaDto.getPeso())
                .altura(avaliacaoFisicaDto.getAltura())
                .porcentagemCorporal(avaliacaoFisicaDto.getPorcentagemCorporal())
                .build();

        aluno.setAvaliacaoFisica(avaliacaoFisica);
        alunoRepository.save(aluno);
    }

}
