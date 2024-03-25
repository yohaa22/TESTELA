import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[80];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        Numeros09 contador = new Numeros09(numeros);
        int numerosNoIntervalo = contador.contarNumerosNoIntervalo();

        System.out.println("Número(s) no intervalo entre 10 e 150 (inclusive): " + numerosNoIntervalo);

        scanner.close();
    }
}
