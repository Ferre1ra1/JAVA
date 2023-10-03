package br.com.Desafio.sreenMatch;

public class Preferidos {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é um dos melhores");
        }else if (audio.getClassificacao() >= 6 && audio.getClassificacao() < 9){
            System.out.println(audio.getTitulo() + " é bom");
        }else{
            System.out.println(audio.getTitulo() + " é um dos piores");
        }
    }
}
