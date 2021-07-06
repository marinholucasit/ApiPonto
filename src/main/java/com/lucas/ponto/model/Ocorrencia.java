package com.lucas.ponto.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
public class Ocorrencia {
    @Id
    private long id;
    private String nome;
    private String descricao;
}
