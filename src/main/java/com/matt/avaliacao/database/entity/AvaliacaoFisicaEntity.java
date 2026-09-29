package com.matt.avaliacao.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "avaliacoes_fisicas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AvaliacaoFisicaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private BigDecimal peso;
    @Column(nullable = false)
    private BigDecimal altura;
    @Column(name = "porcentagem_corporal", nullable = false)
    private BigDecimal porcentagemCorporal;

}
