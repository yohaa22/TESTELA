public class Aprender20 {
    private int nivel;
    private double valorHoraAula;

    public Aprender20(int nivel) {
        this.nivel = nivel;
        definirValorHoraAula();
    }

    private void definirValorHoraAula() {
        switch (nivel) {
            case 1:
                valorHoraAula = 12.00;
                break;
            case 2:
                valorHoraAula = 17.00;
                break;
            case 3:
                valorHoraAula = 25.00;
                break;
            default:
                System.out.println("Nível inválido");
        }
    }

    public double calcularSalario(int horasAula) {
        return valorHoraAula * horasAula;
    }
}
