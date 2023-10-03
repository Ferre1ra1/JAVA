package br.com.Desafio.sreenMatch;

import javax.swing.*;

public class Podcast extends Audio {
    private int publicoAoVivo;
    private String temaPodCast;

    public int getPublicoAoVivo() {
        return publicoAoVivo;
    }

    public void setPublicoAoVivo(int publicoAoVivo) {
        this.publicoAoVivo = publicoAoVivo;
    }

    public String getTemaPodCast() {
        return temaPodCast;
    }

    public void setTemaPodCast(String temaPodCast) {
        this.temaPodCast = temaPodCast;
    }

    @Override
    public void reproduzir() {
        JOptionPane.showMessageDialog(null,
                "Nome do podcast: " + getTitulo()
                        + "\n" +"Tema do podcast: " +getTemaPodCast()+
                        "\n"+ "Total de pessoas assistindo: "+getPublicoAoVivo()+
                        "\n" +"Duração: " + getDuracao()+ " minutos"+
                        "\n" +"Classificação: " +getClassificacao());
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas() >= 2000) {
            return 10;
        } else if (this.getTotalCurtidas() >= 20 && this.getTotalCurtidas() < 50){
            return 8;
        }else{
            return 5;
        }
    }



    }

