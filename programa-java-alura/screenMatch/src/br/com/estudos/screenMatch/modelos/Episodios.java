package br.com.estudos.screenMatch.modelos;

import br.com.estudos.screenMatch.calculos.Classificacao;

public class Episodios implements Classificacao {



    private int totalDeVisualizacao;
    private int numero;
    private String nome;
 private Series serie;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    public int getTotalDeVisualizacao() {
        return totalDeVisualizacao;
    }

    public void setTotalDeVisualizacao(int totalDeVisualizacao) {
        this.totalDeVisualizacao = totalDeVisualizacao;
    }

    @Override
    public int getClassificacao() {
        if(totalDeVisualizacao > 100) {
            return 4;
        }else{
            return 2;
        }
    }

}
