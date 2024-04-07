import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] notas = new float[10];

        float[] medias = new float[10];

        int contador = 0;
        sc.close();

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a nota do aluno %d: ", i + 1);
            notas[i] = sc.nextFloat();
        }

        for (int i = 0; i < medias.length; i++) {
            medias[i] = notas[i] / 4;
        }

        for (int i = 0; i < medias.length; i++) {
            System.out.printf("A média do aluno %d é: %.2f\n", i + 1, medias[i]);
        }
        for (float media : medias) {
            if (media >= 7.0) {
                contador++;
            }
        }
        System.out.printf("O número de alunos com média maior ou igual a 7.0 é: %d\n", contador);
    }
}
