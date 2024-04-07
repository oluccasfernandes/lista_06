import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota da 1ª avaliação:");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a nota da 2ª avaliação:");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a nota da 3ª avaliação:");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7.0) {
            System.out.println("Parabéns! Você foi aprovado!");
        } else {
            System.out.println("Infelizmente, você foi reprovado.");
        }

        System.out.println("Sua média é: " + media);
        scanner.close();
    }
}
