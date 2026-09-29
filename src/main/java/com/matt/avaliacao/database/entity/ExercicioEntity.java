package com.matt.avaliacao.database.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "exercicios")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExercicioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false, name = "grupo_muscular")
    private String grupoMuscular;
}
