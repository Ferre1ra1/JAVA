package br.com.Desafio.screenMatch.Saida;

import br.com.Desafio.sreenMatch.Musicas;
import br.com.Desafio.sreenMatch.Podcast;
import br.com.Desafio.sreenMatch.Preferidos;

public class SaidaMain {
    public static void main(String[] args) {
        Musicas musicas = new Musicas();
        musicas.setTitulo("A vida é um desafio");
        musicas.setNomeArtista("Racionais MC's");
        musicas.setGeneroMusica("Pop");
        musicas.setDuracao(3);
        for(int i = 0; i <= 5000; i++){
            musicas.curtir();
        }
        for(int f = 0; f < 1000; f++){
            musicas.reproducao();
        }
        musicas.reproduzir();


        Podcast podcast = new Podcast();
        podcast.setTitulo("Alura - podcast");
        podcast.setTemaPodCast("Git e Github");
        podcast.setPublicoAoVivo(2000);
        podcast.setDuracao(90);
        for(int i = 0; i <= 2000; i++){
            podcast.curtir();
        }
        for(int f = 0; f < 1000; f++){
            podcast.reproducao();
        }
        podcast.reproduzir();

        Preferidos filtra = new Preferidos();
        filtra.inclui(podcast);
        filtra.inclui(musicas);
    }
}
