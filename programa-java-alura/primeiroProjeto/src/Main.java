
import javax.swing.*;
public class Main {
    /* tecla alt + 1 -> fecha aba lateral */

    public static void main(String[] args) {
        System.out.println("Bem vindo ao Screen Match");

        int anoLancamento = 2019;
        double media = (9.8 + 6.2) / 2;
        int classificacao = (int) (media / 2);
        System.out.println("Nota média sobre os críticos: "+media);
        String sinopse;
        sinopse = """
                Filme: IT - A coisa
                Ano do lançamento
                """ + anoLancamento;
        JOptionPane.showMessageDialog(null,sinopse);
        JOptionPane.showMessageDialog(null,"Nota "+classificacao);

    }
}