package br.com.Desafio.sreenMatch;

import br.com.estudos.screenMatch.calculos.Classificacao;

import javax.swing.*;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalDeReproducao;

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public void setTotalCurtidas(int totalCurtidas) {
        this.totalCurtidas = totalCurtidas;
    }

    private int totalCurtidas;
    private int curtidas;
    private int classificacao;

    public void curtir(){
        this.totalCurtidas++;
        }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducao() {
        return totalDeReproducao;
    }

    public void setTotalDeReproducao(int totalDeReproducao) {
        this.totalDeReproducao = totalDeReproducao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public void reproduzir(){
        System.out.println("Reproduzindo: "+this.titulo
                + "\n" + "Duração: "+duracao +" minutos" + "\n" + "Classificação: " +this.classificacao
        );
    }

    public void reproducao(){
        this.totalDeReproducao++;
    }
}
