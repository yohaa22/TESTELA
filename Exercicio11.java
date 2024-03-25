import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalHomens = 0;
        int totalMulheres = 0;

        for (int i = 1; i <= 56 ; i++) {
            System.out.println("Pessoa " + i + ":");
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o sexo (M/F): ");
            char sexo = scanner.nextLine().toUpperCase().charAt(0);

            Humanos11 pessoa = new Humanos11(nome, sexo);
            System.out.println("Nome: " + pessoa.getNome() + ", Sexo: " + pessoa.getSexo());

            if (pessoa.getSexo() == 'M') {
                totalHomens++;
            } else if (pessoa.getSexo() == 'F') {
                totalMulheres++;
            }
        }

        System.out.println("\nTotal de homens: " + totalHomens);
        System.out.println("Total de mulheres: " + totalMulheres);

        scanner.close();
    }
}
