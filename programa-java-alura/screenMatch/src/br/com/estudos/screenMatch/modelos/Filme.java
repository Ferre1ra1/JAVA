package br.com.estudos.screenMatch.modelos;

import br.com.estudos.screenMatch.calculos.Classificacao;

import javax.swing.*;

public class Filme extends Titulo implements Classificacao {
    private String nomeDiretor;

    @Override
    public int getClassificacao() {
        return (int) mediaAvaliacao() / 2;
    }

    //////////////////-- GETTERS AND SETTERS --////////////////////////

    public String getNomeDiretor() {
        return nomeDiretor;
    }

    public void setNomeDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }
}
