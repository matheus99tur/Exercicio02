import java.util.Scanner;

public class Exercicio03 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o tamanho do vetor: ");
    int tamanho = scanner.nextInt();
    int[] vetorOriginal = new int[tamanho];
    int[] vetorDobro = new int[tamanho];

    for (int i = 0; i < tamanho; i++) {
      System.out.print("Digite um número na posição " + i + ": ");
      vetorOriginal[i] = scanner.nextInt();
    }

    for (int i = 0; i < tamanho; i++) {
      vetorDobro[i] = vetorOriginal[i] * 2;
    }

    System.out.println("\nValores do vetor com o dobro:");
    for (int i = 0; i < tamanho; i++) {
      System.out.println("Posição " + i + ": " + vetorDobro[i]);
    }

    scanner.close();
  }
}
