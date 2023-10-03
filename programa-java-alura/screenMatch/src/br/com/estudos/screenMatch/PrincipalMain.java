package br.com.estudos.screenMatch;

import br.com.estudos.screenMatch.calculos.CalculadoraDeTempo;
import br.com.estudos.screenMatch.calculos.FiltroRecomendacao;
import br.com.estudos.screenMatch.modelos.Episodios;
import br.com.estudos.screenMatch.modelos.Filme;
import br.com.estudos.screenMatch.modelos.Series;

    public class PrincipalMain {
        public static void main(String[] args) {

              Filme filme = new Filme();

                filme.setName("IT - A coisa");
                filme.setAnoLancamento(2019);
                filme.setIncluindoNoPlano(true);
                filme.setDuracaoEmMinutos(180);
                filme.exibeInformacoesBasicas();
                filme.somaDeAvaliacao(6);
                filme.somaDeAvaliacao(10);
                filme.somaDeAvaliacao(2);
            System.out.println("Média das notas: "+filme.mediaAvaliacao());
            Filme outroFilme = new Filme();

            outroFilme.setName("Star wars - Uma nova esperança");
            outroFilme.setAnoLancamento(1990);
            outroFilme.setIncluindoNoPlano(true);
            outroFilme.setDuracaoEmMinutos(200);
            outroFilme.exibeInformacoesBasicas();

            Series serie = new Series();

                serie.setName("The Bad Batch");
                serie.setAnoLancamento(2022);
                serie.setMinutosPorEpisodios(25);
                serie.setEpisodiosPorTemporada(20);
                serie.setTemporadas(3);
                serie.exibeInformacoesBasicas();




                CalculadoraDeTempo calc = new CalculadoraDeTempo();
                calc.inclui(filme);
                calc.inclui(outroFilme);
                calc.inclui(serie);
                System.out.println(calc.getTempoTotal());

            FiltroRecomendacao filtro = new FiltroRecomendacao();
            filtro.filtra(filme);

            Episodios episodio = new Episodios();
            episodio.setNumero(1);
            episodio.setSerie(serie);
            episodio.setTotalDeVisualizacao(90);
            filtro.filtra(episodio);
        }
    }
