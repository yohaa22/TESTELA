import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantas pessoas deseja cadastrar? ");
        int quantidadePessoas = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        int totalApto = 0;
        int totalInapto = 0;

        for (int i = 1; i <= quantidadePessoas; i++) {
            System.out.println("\nDados da pessoa " + i + ":");
            Militares13 pessoa = new Militares13();
            pessoa.lerDados(scanner);

            if (pessoa.isApto()) {
                System.out.println("Apto para o serviço militar obrigatório.");
                totalApto++;
            } else {
                System.out.println("Inapto para o serviço militar obrigatório.");
                totalInapto++;
            }
        }

        System.out.println("\nTotal de pessoas aptas: " + totalApto);
        System.out.println("Total de pessoas inaptas: " + totalInapto);

        scanner.close();
    }
}
