import java.util.Scanner;

public class Carango12 {
    private int ano;




    public  void solicitarDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano do veículo: ");
        this.ano = scanner.nextInt();

        scanner.close();

    }

    public double calcularDesconto() {
        if (ano <= 2000) {
            return 0.12; 
        } else {
            return 0.07; 
        }
    }

    public double calcularValorAPagar() {
        double valorVeiculo = 30000; 
        double desconto = calcularDesconto();
        return valorVeiculo - (valorVeiculo * desconto);
    }

    public int getAno() {

        return ano;
    }
        
    
}
