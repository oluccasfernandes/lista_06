import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o peso (em kg): ");
        double peso = sc.nextDouble();
        System.out.println("Digite a altura (em metros): ");
        double altura = sc.nextDouble();
        double imc = calcularIMC(peso, altura);
        String situacaoPeso = determinarSituacaoPeso(imc);
        System.out.println("Seu IMC é: " + imc);
        System.out.println("Sua situação de peso é: " + situacaoPeso);
        sc.close();
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String determinarSituacaoPeso(double imc) {
        if (imc < 20) {
            return "Abaixo do peso";
        } else if (imc >= 20 && imc < 25) {
            return "Peso Normal";
        } else if (imc >= 25 && imc < 30) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc < 40) {
            return "Obeso";
        } else {
            return "Obeso Mórbido";
        }
    }
}
