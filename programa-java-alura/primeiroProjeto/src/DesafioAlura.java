import java.util.Scanner;
public class DesafioAlura {

    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    double saldo = 1000;
    int botao = 0;
    String tipoConta = "Corrente";
    String nomeCliente = "Gustavo Ferreira";

     System.out.println("*************");
        System.out.println("\n Nome do cliente:"+nomeCliente);
        System.out.println("\n Tipo de conta:"+tipoConta);
        System.out.println("\n Saldo atual:"+saldo);
        System.out.println("*************");

       String esq= """
               Digite sua opção
               1 - Consultar valor
               2 - Depositar valor 
               3 - Transferir valor
               4 - Sair
               """;

        while(botao != 4){
            System.out.println(esq);
            botao = leia.nextInt();
            if(botao == 1)
            {
                System.out.println("Saldo atual: "+saldo +"R$ \n");
            } else if(botao == 2){
                System.out.println("Quando deseja depositar:");
                double valorAdic = leia.nextDouble();
                saldo += valorAdic;
                System.out.println("Saldo atualizado: "+saldo + "R$ \n");
            }else if(botao == 3) {
                double valorRem;
                System.out.println("Quanto deseja transferir:");
                valorRem = leia.nextDouble();
                if(valorRem > saldo){
                    System.out.println("Não posso concluir essa transferência");
                }else {
                    saldo -= valorRem;
                    System.out.println("Saldo atualizado: "+saldo +"R$");
                }
            }else if(botao != 4){
                System.out.println("Opção inválida");
            }
        }

        }

    }

