import java.util.Scanner;

public class Exercicio04 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    // Definindo o tamanho do vetor
    int tamanho = 5;
    int[] vetor = new int[tamanho];

    // Lendo os números e armazenando no vetor
    for (int i = 0; i < tamanho; i++) {
      System.out.print("Digite um número na posição " + i + ": ");
      vetor[i] = scanner.nextInt();
    }

    // Lendo o valor de n
    System.out.print("Digite um número para comparar (n): ");
    int n = scanner.nextInt();

    // Mostrando os índices dos elementos menores que n
    System.out.println("\nÍndices dos elementos menores que " + n + ":");
    for (int i = 0; i < tamanho; i++) {
      if (vetor[i] < n) {
        System.out.println("Índice " + i);
      }
    }

    scanner.close();
  }
}
