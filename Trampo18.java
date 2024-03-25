public class Trampo18 {
    private String nome;
    private int idade;
    private char sexo;
    private double salarioFixo;

    public Trampo18(String nome, int idade, char sexo, double salarioFixo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.salarioFixo = salarioFixo;
    }

    public double calcularSalarioLiquido() {
        double abono;
        if (sexo == 'M' && idade >= 30) {
            abono = 100.00;
        } else if (sexo == 'M' && idade < 30) {
            abono = 50.00;
        } else if (sexo == 'F' && idade >= 30) {
            abono = 200.00;
        } else {
            abono = 80.00;
        }

        return salarioFixo + abono;
    }
}
