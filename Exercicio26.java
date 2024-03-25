import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do pretendente:");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do pretendente:");
        int idade = scanner.nextInt();

        System.out.println("Digite o grupo de risco do pretendente (1, 2 ou 3):");
        int grupoRisco = scanner.nextInt();

        Seguradora26 seguradora = new Seguradora26(nome, idade, grupoRisco);
        String categoria = seguradora.determinarCategoria();

        System.out.println("Nome: " + seguradora.getNome());
        System.out.println("Idade: " + seguradora.getIdade());
        System.out.println("Grupo de Risco: " + seguradora.getGrupoRisco());
        System.out.println("Categoria de seguro: " + categoria);

        scanner.close();
    }
}
