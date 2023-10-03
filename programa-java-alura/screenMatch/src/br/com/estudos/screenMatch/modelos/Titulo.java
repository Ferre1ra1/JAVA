package br.com.estudos.screenMatch.modelos;

import javax.swing.*;
import br.com.estudos.screenMatch.modelos.Filme;


public class Titulo {
    private String name;
    private int anoLancamento;
    private boolean incluindoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao;
    int duracaoEmMinutos;

    public void exibeInformacoesBasicas(){
        JOptionPane.showMessageDialog(null, "Nome do filme: "+name + "\n" + "Ano de lançamento: "+anoLancamento + "\n" +"Duração do filme : "+duracaoEmMinutos + " minutos");
    }
    public void somaDeAvaliacao(double avaliacao){
        somaDasAvaliacoes += avaliacao;
        totalDeAvaliacao++;
    }
    public double mediaAvaliacao(){
        return somaDasAvaliacoes / totalDeAvaliacao;
    }

    public int getContadorAvaliacao() {
        return totalDeAvaliacao;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluindoNoPlano(boolean incluindoNoPlano) {
        this.incluindoNoPlano = incluindoNoPlano;
    }

}
