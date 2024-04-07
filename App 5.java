import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];

        System.out.println("Digite 20 números inteiros:");
        sc.close();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        int indicePar = 0;
        int indiceImpar = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares[indicePar++] = numero;
            } else {
                impares[indiceImpar++] = numero;
            }
        }

        System.out.println("\nVetor original:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println("\n\nVetor de pares:");
        for (int i = 0; i < indicePar; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.println("\n\nVetor de ímpares:");
        for (int i = 0; i < indiceImpar; i++) {
            System.out.print(impares[i] + " ");
        }

        System.out.println();
    }
}
