import java.util.Scanner;

public class ContadorDeLetraA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita uma string ao usuário
        System.out.print("Informe uma string: ");
        String input = scanner.nextLine();

        // Inicializa a contagem
        int count = 0;

        // Converte a string para caracteres e verifica a ocorrência de 'a' ou 'A'
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'a' || c == 'A') {
                count++;
            }
        }

        // Exibe o resultado
        if (count > 0) {
            System.out.println("A letra 'a' aparece " + count + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }

        scanner.close();
    }
}
