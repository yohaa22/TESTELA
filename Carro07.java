public class Carro07 {
     double custoFabrica;
     double percentualDistribuidor = 0.28; 
     double impostos = 0.45; 

    public Carro07(double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }

    public double calcularCustoConsumidor() {
        double custoImpostos = custoFabrica * impostos;
        double custoDistribuidor = (custoFabrica + custoImpostos) * percentualDistribuidor;
        return custoFabrica + custoImpostos + custoDistribuidor;
    }
}
