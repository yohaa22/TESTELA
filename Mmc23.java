public class Mmc23 {
     String nome;
     char sexo;
     double altura;
     int idade;

    public Mmc23(String nome, char sexo, double altura, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
        this.idade = idade;
    }

    public double calcularPesoIdeal() {
        if (sexo == 'M') {
            if (altura > 1.70) {
                if (idade <= 20) {
                    return (72.7 * altura) - 58;
                } else if (idade >= 21 && idade <= 39) {
                    return (72.7 * altura) - 53;
                } else {
                    return (72.7 * altura) - 45;
                }
            } else {
                if (idade <= 40) {
                    return (72.7 * altura) - 50;
                } else {
                    return (72.7 * altura) - 58;
                }
            }
        } else { // sexo == 'F'
            if (altura > 1.50) {
                if (idade >= 35) {
                    return (62.1 * altura) - 45;
                } else {
                    return (62.1 * altura) - 44.7;
                }
            } else {
                if (idade >= 35) {
                    return (62.1 * altura) - 49;
                } else {
                    return (62.1 * altura) - 44.7;
                }
            }
        }
    }
}
