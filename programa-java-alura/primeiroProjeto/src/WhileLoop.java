import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int count = 0;
        while (nota != -1) {
            System.out.println("Digite sua nota sobre o filme: (digite -1 para sair) ");
            nota = leia.nextDouble();
            if(nota != -1 ) {
                mediaAvaliacao += nota;
                count++;
            }
            }

        System.out.println("Média de avaliações: "+mediaAvaliacao/count);
    }
}
