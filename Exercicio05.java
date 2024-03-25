import java.util.Scanner;

public class Exercicio05 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     

        System.out.print("Escreva o valor do produto: ");
        double parcela = scanner.nextDouble();


        Parcela05 valorCompra = new Parcela05 (parcela);

        System.out.println("o preço da parcela é "  + valorCompra.preco() );

        scanner.close();
    
}
}