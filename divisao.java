import java.util.Scanner;

public class divisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double numero2 = scanner.nextDouble();

        if (numero2 != 0) {
            double resultado = numero1 / numero2;
            System.out.println("O resultado da divisão é: " + resultado);
        } else {
            System.out.println("Não é possível dividir por zero.");
        }

        scanner.close();
    }
}
