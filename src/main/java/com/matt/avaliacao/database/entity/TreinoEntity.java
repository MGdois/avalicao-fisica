package com.matt.avaliacao.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "treinos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TreinoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    AlunoEntity aluno;

    @ManyToMany
    @JoinTable(
            joinColumns = @JoinColumn(name = "treino_id"),
            inverseJoinColumns = @JoinColumn(name = "exercicio_id")
    )
    private Set<ExercicioEntity> exercicios = new HashSet<>();
}
