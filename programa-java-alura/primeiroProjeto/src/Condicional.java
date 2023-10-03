
import java.util.Scanner;
public class Condicional {
    public static void main(String[] args) {
        int anoLancamento = 2019;
        boolean plano = false;
        double notaFilme= 8.1;
        String tipoPlano = "Plus";
        if(anoLancamento >= 2019){
            System.out.println("As pessoas estão curtindo");

        }else{
            System.out.println("As pessoas não estão curtindo");
        }

        if(plano && tipoPlano.equals("Plus")){
            System.out.println("Filme liberado");
        }else{
            System.out.println("Filme não liberado");
        }

    }
}
