public class Exercicio16 {
    public static void main(String[] args) {
        Funcionario16[] funcionarios = {
            new Funcionario16("Funcionario1", 2000),
            new Funcionario16("Funcionario2", 4000),
            new Funcionario16("Funcionario3", 7000),
            new Funcionario16("Funcionario4", 2600),
            new Funcionario16("Funcionario5", 2300),
            new Funcionario16("Funcionario6", 4600),
            new Funcionario16("Funcionario7", 5000),
            new Funcionario16("Funcionario8", 1000),
            new Funcionario16("Funcionario9", 1200),
            new Funcionario16("Funcionario10", 12000),
            new Funcionario16("Funcionario11", 6000),
            new Funcionario16("Funcionario12", 47000),
            new Funcionario16("Funcionario13", 2600),
            new Funcionario16("Funcionario14", 600),
            new Funcionario16("Funcionario15", 9000),
            new Funcionario16("Funcionario16", 12000),
            new Funcionario16("Funcionario17", 9800),
            new Funcionario16("Funcionario18", 4700),
            new Funcionario16("Funcionario19", 6500),
            new Funcionario16("Funcionario20", 650),
            new Funcionario16("Funcionario21", 4800),
            new Funcionario16("Funcionario22", 20300),
            new Funcionario16("Funcionario23", 400),
            new Funcionario16("Funcionario24", 40600),


        };
        double totalReajuste = 0;

        // Calcula e exibe o reajuste para cada funcionário
        for (Funcionario16 funcionario : funcionarios) {
            double reajuste = funcionario.calcularReajuste();
            totalReajuste += reajuste;

            System.out.println("Nome: " + funcionario.getNome() + ", Salário: R$" + funcionario.getSalario() +
                    ", Reajuste: R$" + reajuste);
        }

        System.out.println("Total de reajuste: R$" + totalReajuste);
    }
}
