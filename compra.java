import java.util.Scanner;

public class compra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a descrição do produto: ");
        String descricao = sc.nextLine();
        System.out.print("Digite a quantidade adquirida: ");
        int quantidade = sc.nextInt();
        System.out.print("Digite o preço unitário: ");
        double precoUnitario = sc.nextDouble();
        double total = quantidade * precoUnitario;

        double desconto;
        if (quantidade <= 5) {
            desconto = total * 0.02;
        } else if (quantidade <= 10) {
            desconto = total * 0.03;
        } else if (quantidade < 30) {
            desconto = total * 0.05;
        } else {
            desconto = total * 0.10;
        }
        double totalAPagar = total - desconto;

        System.out.println("\nDescrição do produto: " + descricao);
        System.out.println("Quantidade adquirida: " + quantidade);
        System.out.println("Preço unitário: R$" + precoUnitario);
        System.out.println("Total: R$" + total);
        System.out.println("Desconto: R$" + desconto);
        System.out.println("Total a pagar: R$" + totalAPagar);
        sc.close();
    }
}
