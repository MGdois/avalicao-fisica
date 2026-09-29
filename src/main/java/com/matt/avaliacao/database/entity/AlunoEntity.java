package com.matt.avaliacao.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "alunos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AlunoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false, unique = true)
    private String email;

    @OneToOne
    @JoinColumn(name = "avalicao_fisica_id")
    private AvaliacaoFisicaEntity avaliacaoFisica;

    @OneToMany(mappedBy = "aluno")
    private Set<TreinoEntity> treino = new HashSet<>();

}
