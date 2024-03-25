public class Numeros09 {
    private int[] numeros;

    public Numeros09(int[] numeros) {
        this.numeros = numeros;
    }

    public int contarNumerosNoIntervalo() {
        int contador = 0;
        for (int numero : numeros) {
            if (numero >= 10 && numero <= 150) {
                contador++;
            }
        }
        return contador;
    }
}
