import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Digite os 5 números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }

        int multiplicacao = 1;
        for (int numero : numeros) {
            multiplicacao *= numero;
        }

        System.out.println("Soma: " + soma);
        System.out.println("Multiplicação: " + multiplicacao);

        System.out.println("Números:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        sc.close();
    }
}
