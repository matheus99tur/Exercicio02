import java.util.Scanner;

public class Exercicio05 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    int tamanho = 5;
    int[] vetor = new int[tamanho];

    for (int i = 0; i < tamanho; i++) {
      System.out.print("Digite um número na posição " + i + ": ");
      vetor[i] = scanner.nextInt();
    }

    System.out.print("Digite um número para contar (n): ");
    int n = scanner.nextInt();

    int contador = 0;
    for (int num : vetor) {
      if (num == n) {
        contador++;
      }
    }

    System.out.println("\nO número " + n + " aparece " + contador + " vezes no vetor.");

    scanner.close();
  }
}
