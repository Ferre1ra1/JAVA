package br.com.alura.screenmatch.DadosSeries;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosSeries(@JsonAlias({"Title", "Titulo"}) String titulo,
                          @JsonAlias({"totalSeasons", "Total de temporada" })int totalTemp,
                          @JsonAlias("Metascore") String avaliacao) {

}
