import java.util.Scanner;

public class eleicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade da pessoa:");
        int idade = sc.nextInt();

        String classificacao;

        if (idade < 16) {
            classificacao = "Não é eleitor";
        } else if (idade >= 16 && idade <= 17) {
            classificacao = "Eleitor facultativo";
        } else if (idade >= 18 && idade <= 65) {
            classificacao = "Eleitor obrigatório";
        } else {
            classificacao = "Eleitor facultativo";
        }

        System.out.println("A classificação eleitoral é: " + classificacao);

        sc.close();
    }
}
