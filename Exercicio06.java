import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     

        System.out.print("Escreva o valor do produto: ");
        double precoTotal = scanner.nextDouble();

        System.out.print("Escreva a porcentagem de acrecimo: ");
        double pct = scanner.nextDouble();



        Preco06 preco = new Preco06(precoTotal, pct);

        double precoFinal = preco.calcularPrecoFinal();

    

        System.out.println("o valor com acrecimo é  "  + precoFinal );

        scanner.close();
    
}
}
    

