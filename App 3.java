import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[4];
        double somaNotas = 0;
        double media;

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a %dª nota: ", i + 1);
            notas[i] = sc.nextDouble();
            somaNotas += notas[i];
        }
        media = somaNotas / notas.length;

        System.out.println("\nNotas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("%.2f ", notas[i]);
        }

        System.out.printf("\nMédia: %.2f\n", media);
        sc.close();
    }
}
