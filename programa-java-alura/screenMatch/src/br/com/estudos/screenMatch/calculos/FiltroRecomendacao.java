package br.com.estudos.screenMatch.calculos;

public class FiltroRecomendacao {
    public void filtra(Classificacao classificado){
        if(classificado.getClassificacao() >= 4){
            System.out.println("Um dos preferidos");
        }else if (classificado.getClassificacao() >= 2){
            System.out.println("Bem avaliado");
        }else{
            System.out.println("Adicione a sua lista ");
        }
    }
}
