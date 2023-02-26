package br.com.github.GabrielRechBrand.integrationtjsc.dto;

import br.com.github.GabrielRechBrand.integrationtjsc.tjsc.EnteDeclaradoUtilidadePublicaEstadual;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EnteDeclaradoDTO {

    private Integer codigoComarca;
    private String lei;
    private String nome;

    public EnteDeclaradoDTO(EnteDeclaradoUtilidadePublicaEstadual ente) {
        this.codigoComarca = ente.getCdcomarca();
        this.lei = ente.getLei();
        this.nome = ente.getNomeEntidade();
    }

}
