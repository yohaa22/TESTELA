
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do vendedor: ");
        String nomeV = scanner.nextLine();

        System.out.print("Escreva o salário fixo: ");
        double salario = scanner.nextDouble();

        System.out.print("Escreva o total de vendas: ");
        double total = scanner.nextDouble();

        Vendedor03 vendedor = new Vendedor03(nomeV, salario, total);

        double salarioTT = vendedor.salarioTT();

        System.out.println("O salário total do vendedor " + vendedor.getNome() + " é: " + salarioTT);

        scanner.close();
    }
}
