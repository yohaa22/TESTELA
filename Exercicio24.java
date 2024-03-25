import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota do trabalho de laboratório:");
        double notaLaboratorio = scanner.nextDouble();

        System.out.println("Digite a nota da avaliação semestral:");
        double notaAvaliacaoSemestral = scanner.nextDouble();

        System.out.println("Digite a nota do exame final:");
        double notaExameFinal = scanner.nextDouble();

        Curso24 curso = new Curso24(notaLaboratorio, notaAvaliacaoSemestral, notaExameFinal);
        double notaFinal = curso.calcularNotaFinal();

        System.out.println("A nota final do estudante é: " + notaFinal);

        scanner.close();
    }
}
