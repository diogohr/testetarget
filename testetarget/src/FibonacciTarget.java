import java.util.Scanner;

public class FibonacciTarget {

    // Função que verifica se um número pertence à sequência de Fibonacci
    public static boolean isFibonacci(int num) {
        // Dois primeiros números da sequência
        int a = 0, b = 1;

        // Se o número for 0 ou 1, pertence à sequência
        if (num == a || num == b) {
            return true;
        }

        // Calcula os próximos números da sequência até encontrar ou ultrapassar o número informado
        int next = a + b;
        while (next <= num) {
            if (next == num) {
                return true;
            }
            a = b;
            b = next;
            next = a + b;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita um número ao usuário
        System.out.print("Informe um número: ");
        int num = scanner.nextInt();

        // Verifica se o número informado pertence à sequência de Fibonacci
        if (isFibonacci(num)) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
