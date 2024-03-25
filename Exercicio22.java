import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tipo de cliente (Residência(R), Comércio(C) ou Indústria(I)):");
        String tipoCliente = scanner.nextLine();

        System.out.println("Informe o consumo em kWh:");
        int consumo = scanner.nextInt();

        Luz22  luz = new Luz22(tipoCliente);
        double valorConta = luz.calcularConta(consumo);

        System.out.println("O valor da conta de luz é: R$" + valorConta);

        scanner.close();
    }
}
