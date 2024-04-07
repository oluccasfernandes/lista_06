import java.util.Scanner;

public class votos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de votos brancos: ");
        int brancos = sc.nextInt();
        System.out.print("Digite o número de votos nulos: ");
        int nulos = sc.nextInt();
        System.out.print("Digite o número de votos válidos: ");
        int validos = sc.nextInt();

        int totalVotos = brancos + nulos + validos;

        double percentualBrancos = (double) brancos / totalVotos * 100;
        double percentualNulos = (double) nulos / totalVotos * 100;
        double percentualValidos = (double) validos / totalVotos * 100;

        System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");
        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
        System.out.println("Percentual de votos válidos: " + percentualValidos + "%");
        sc.close();
    }
}
