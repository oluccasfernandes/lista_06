import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        char[] vetor = new char[10];
        int consoantes = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o %dº caractere: ", i + 1);
            vetor[i] = (char) System.in.read();
        }

        for (char c : vetor) {
            if (!isVogal(c)) {
                consoantes++;
            }
        }
        System.out.printf("Quantidade de consoantes: %d\n", consoantes);
        System.out.println("Consoantes:");
        for (char c : vetor) {
            if (!isVogal(c)) {
                System.out.print(c + " ");
            }
        }
    }

    private static boolean isVogal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
