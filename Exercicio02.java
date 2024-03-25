import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("escreva a distancia percorrida: ");
        double distancia = scanner.nextDouble();

        System.out.println("escreva o total de combustivel: ");
        double combustivel = scanner.nextDouble();


        Automovel02 automovel = new Automovel02(distancia, combustivel );


        System.out.println("o consumo medio é"  + automovel.consumo() + "km/l" );
       




        scanner.close();

    }
}