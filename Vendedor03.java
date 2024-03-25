class Vendedor03 {

    String nomeV;
    double salario;
    double total;

    public Vendedor03(String nome, double salario, double total) {
        this.nomeV = nome;
        this.salario = salario;
        this.total = total;
    }

    public double salarioTT() {
        return salario + (total * 0.15);
    }

    public String getNome() {
        return nomeV;
    }
}

