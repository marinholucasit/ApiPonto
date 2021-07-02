package com.lucas.ponto.model;

import lombok.*;

import javax.persistence.OneToMany;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Calendario {
    private  Long id;
    @OneToMany
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime dataEspecial;
}
