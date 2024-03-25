import java.util.Scanner;

public class Exercicio04 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("escreva a cotação do dolar: ");
        double precoDolar = scanner.nextDouble();

        System.out.println("escreva o total de dolares: ");
        double dolar = scanner.nextDouble();


        Dinheiro04 dinheiro = new Dinheiro04(precoDolar, dolar );


        System.out.println("o total em reais é"  + dinheiro.reais() );
       




        scanner.close();

    }
}
