public class Pessoa10 {
     int idade;

    public Pessoa10(int idade) {
        this.idade = idade;
    }

    public String obterClassificacaoIdade() {
        if (idade >= 18) {
            return "maior de idade";
        } else {
            return "menor de idade";
        }
    }
}
