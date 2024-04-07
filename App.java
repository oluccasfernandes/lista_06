import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            vetor[i] = sc.nextInt();
        }

        System.out.println("Números digitados:");
        for (int numero : vetor) {
            System.out.println(numero);
        }
        sc.close();
    }
}
