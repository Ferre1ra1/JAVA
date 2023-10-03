package br.com.Desafio.sreenMatch;

import javax.swing.*;

public class Musicas extends Audio{
    private String generoMusica;
    private String nomeArtista;

    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public String getGeneroMusica() {
        return generoMusica;
    }

    public void setGeneroMusica(String generoMusica) {
        this.generoMusica = generoMusica;
    }

    @Override
    public void reproduzir() {
        JOptionPane.showMessageDialog(null,
                "Nome da música: " + getTitulo()+
                        "\n" + "Artista: "+ nomeArtista
                        + "\n" +"Gênero: " +generoMusica+
                        "\n" +"Duração: " + getDuracao()+ " minutos"+
                        "\n" +"Classificação: " +getClassificacao());
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalCurtidas() >= 2000){
            return 10;
        }else if (this.getTotalCurtidas() >= 500 && this.getTotalCurtidas() < 1000){
            return 8;
        }else{
            return 5;
        }

    }
}
