import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o lado 1 do triângulo:");
        int lado1 = scanner.nextInt();

        System.out.println("Digite o lado 2 do triângulo:");
        int lado2 = scanner.nextInt();

        System.out.println("Digite o lado 3 do triângulo:");
        int lado3 = scanner.nextInt();

        Triangulo19 triangulo = new Triangulo19(lado1, lado2, lado3);

        System.out.println("O triângulo é: " + triangulo.tipoTriangulo());

        scanner.close();
    }
}
    