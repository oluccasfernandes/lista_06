import java.util.Scanner;

public class estacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Insira um número de 1 a 4 para escolher uma estação do ano:");
        int numeroEstacao = sc.nextInt();
        
        String estacao;
        String mensagem;    
        switch (numeroEstacao) {
            case 1:
                estacao = "Primavera";
                mensagem = "Bem-vindo à Primavera! As flores estão florescendo e os dias estão ficando mais longos.";
                break;
            case 2:
                estacao = "Verão";
                mensagem = "Bem-vindo ao Verão! O sol está brilhando e é hora de aproveitar a praia.";
                break;
            case 3:
                estacao = "Outono";
                mensagem = "Bem-vindo ao Outono! As folhas estão mudando de cor e o ar está ficando mais fresco.";
                break;
            case 4:
                estacao = "Inverno";
                mensagem = "Bem-vindo ao Inverno! É hora de se aconchegar com um chocolate quente e curtir o frio.";
                break;
            default:
                estacao = "Inválida";
                mensagem = "Número de estação inválido. Por favor, insira um número de 1 a 4.";
                break;
        }
        System.out.println("Você escolheu a estação " + estacao + ".");
        System.out.println(mensagem);
        sc.close();
    }
}
