public class Luz22 {
    private String tipoCliente;
    private double valorKWh;

    public Luz22(String tipoCliente) {
        this.tipoCliente = tipoCliente;
        definirValorKWh();
    }

    private void definirValorKWh() {
        switch (tipoCliente) {
            case "R":
                valorKWh = 0.602;
                break;
            case "C":
                valorKWh = 0.483;
                break;
            case "I":
                valorKWh = 1.29;
                break;
            default:
                System.out.println("Tipo de cliente inválido");
        }
    }

    public double calcularConta(int consumo) {
        return valorKWh * consumo;
    }
}
