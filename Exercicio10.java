import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas deseja verificar? ");
        int quantidadePessoas = scanner.nextInt();

        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = scanner.nextInt();

            Pessoa10 pessoa = new Pessoa10(idade);
            System.out.println("A pessoa " + (i + 1) + " é " + pessoa.obterClassificacaoIdade()+ "\n");
        }

        scanner.close();
    }
}
