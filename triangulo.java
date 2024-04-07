import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o comprimento do lado 1 do triângulo:");
        double lado1 = sc.nextDouble();
        System.out.println("Digite o comprimento do lado 2 do triângulo:");
        double lado2 = sc.nextDouble();
        System.out.println("Digite o comprimento do lado 3 do triângulo:");
        double lado3 = sc.nextDouble();
        
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("O triângulo é equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("O triângulo é isósceles.");
            } else {
                System.out.println("O triângulo é escaleno.");
            }
        } else {
            System.out.println("Os comprimentos informados não formam um triângulo válido.");
        }
        
        sc.close();
    }
}
