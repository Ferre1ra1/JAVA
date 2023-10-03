package br.com.estudos.screenMatch.modelos;

import javax.swing.*;

public class Series extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean serieAtiva = false;

    private int minutosPorEpisodios;

    public void exibeInformacoesBasicas(){
        JOptionPane.showMessageDialog(null, "Nome da serie: "+ getName() + "\n" + "Ano de lançamento: "
                +getAnoLancamento() + "\n" +"Duração de cada episódio : "+getMinutosPorEpisodios()  + " minutos" + "\n" + "Temporadas: " + getTemporadas()
            +"\n"+ "Episódios por temporada: "+getEpisodiosPorTemporada() + "\n" + "Duração total para maratonar a série: " +getDuracaoEmMinutos());
    }


    //////////////////-- GETTERS AND SETTERS --////////////////////////


    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodios;
        // super é a nossa classe pai
    }

    public int getTemporadas() {
        return temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public boolean isSerieAtiva() {
        return serieAtiva;
    }

    public int getMinutosPorEpisodios() {
        return minutosPorEpisodios;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public void setSerieAtiva(boolean serieAtiva) {
        this.serieAtiva = serieAtiva;
    }

    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        this.minutosPorEpisodios = minutosPorEpisodios;
    }
}
