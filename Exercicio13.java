import java.util.Scanner;

public class Exercicio13 {
  public static void executar() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um número para obter a sequência de Fibonacci: ");
    int n = sc.nextInt();

    // Chamando o método para obter os n primeiros termos da sequência
    int[] fibonacci = fibonacciSequence(n);

    // Exibindo a sequência de Fibonacci gerada
    System.out.println("Sequência de Fibonacci para os " + n + " primeiros termos:");
    for (int i = 0; i < n; i++) {
      System.out.print(fibonacci[i] + " ");
    }
    System.out.println();

    sc.close();
  }

  // Método para gerar os n primeiros termos da sequência de Fibonacci
  public static int[] fibonacciSequence(int n) {
    int[] fibonacci = new int[n];

    if (n >= 1) {
      fibonacci[0] = 0;
    }
    if (n >= 2) {
      fibonacci[1] = 1;
    }

    for (int i = 2; i < n; i++) {
      fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
    }

    return fibonacci;
  }
}
