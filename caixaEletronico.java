import java.util.Scanner;

public class caixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            
            switch(opcao) {
                case 1:
                    System.out.println("Exibindo saldo...");
                    break;
                case 2:
                    System.out.println("Exibindo extrato...");
                    break;
                case 3:
                    System.out.println("Realizando depósito...");
                    break;
                case 4:
                    System.out.println("Realizando saque...");
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }
        } while (opcao != 5);
        
        scanner.close();
    }
    
    public static void exibirMenu() {
        System.out.println("\n======= Menu =======");
        System.out.println("1. Exibir saldo");
        System.out.println("2. Exibir extrato");
        System.out.println("3. Realizar depósito");
        System.out.println("4. Realizar saque");
        System.out.println("5. Sair");
        System.out.println("=====================");
    }
}
