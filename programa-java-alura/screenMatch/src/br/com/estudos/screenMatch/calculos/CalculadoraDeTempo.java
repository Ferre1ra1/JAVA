package br.com.estudos.screenMatch.calculos;
import br.com.estudos.screenMatch.modelos.Filme;
import br.com.estudos.screenMatch.modelos.Series;
import br.com.estudos.screenMatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }


    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

//    public void inclui(Filme filme){
//        this.tempoTotal += filme.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Series serie){
//        this.tempoTotal += serie.getDuracaoEmMinutos();
//    }
}
