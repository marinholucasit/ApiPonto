package com.lucas.ponto.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
public class Localidade {
    @Id
    private long id;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    private String descricao;
}
