import java.util.Scanner;
public class LeituraDeDados {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu filme: ");
        String filmeFav = leitura.nextLine();
        System.out.println("Seu filme favorito é: "+filmeFav);
        System.out.println("Ano de lançamento do filme: ");
        int anoLancamento = leitura.nextInt();
        System.out.println("Ano de lançamento: " +anoLancamento);
        System.out.println("Avaliação do filme: ");
        double avaliacao = leitura.nextDouble();
        System.out.println("Avaliação: " +avaliacao);
    }
}
