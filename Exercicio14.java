import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto14[] produtos = new Produto14[4];
        double somaPrecoCusto = 0;
        double somaPrecoVenda = 0;

        // Recebendo os dados dos produtos
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Informe o preço de custo do produto " + (i + 1) + ":");
            double precoCusto = scanner.nextDouble();

            System.out.println("Informe o preço de venda do produto " + (i + 1) + ":");
            double precoVenda = scanner.nextDouble();

            produtos[i] = new Produto14(precoCusto, precoVenda);
            somaPrecoCusto += precoCusto;
            somaPrecoVenda += precoVenda;
        }

        // Calculando médias
        double mediaPrecoCusto = somaPrecoCusto / produtos.length;
        double mediaPrecoVenda = somaPrecoVenda / produtos.length;

        System.out.println("\nResultados:");

        // Mostrando se houve lucro, prejuízo ou empate para cada produto
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Produto " + (i + 1) + ": " + produtos[i].verificarLucroOuPrejuizo());
        }

        // Mostrando média de preço de custo e preço de venda
        System.out.println("\nMédia de preço de custo: " + mediaPrecoCusto);
        System.out.println("Média de preço de venda: " + mediaPrecoVenda);

        scanner.close();
    }
}
