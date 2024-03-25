import java.util.Scanner;

public class Militares13 {
     String nome;
     char sexo;
     int idade;
     boolean saude;
    
    public void lerDados(Scanner scanner) {
        System.out.print("Nome: ");
        this.nome = scanner.nextLine();

        System.out.print("Sexo (M/F): ");
        this.sexo = scanner.nextLine().toUpperCase().charAt(0);

        System.out.print("Idade: ");
        this.idade = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Saúde (true/false): ");
        this.saude = scanner.nextBoolean();
        scanner.nextLine(); 
    }

    public boolean isApto() {
        return (sexo == 'M' || sexo == 'm') && idade >= 18 && saude;
    }
}
