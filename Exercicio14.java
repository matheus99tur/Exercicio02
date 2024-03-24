import java.util.Scanner;

public class Exercicio14 {
  public static void executar() {
    Scanner sc = new Scanner(System.in);

    // Definindo o tamanho do vetor
    int tamanho = 5;
    int[] vetor = new int[tamanho];

    // Lendo os elementos do vetor
    for (int i = 0; i < tamanho; i++) {
      System.out.print("Digite o elemento " + (i + 1) + ": ");
      vetor[i] = sc.nextInt();
    }

    // Encontrando o maior elemento no vetor
    int indiceMaior = 0;
    for (int i = 1; i < tamanho; i++) {
      if (vetor[i] > vetor[indiceMaior]) {
        indiceMaior = i;
      }
    }

    // Trocando o maior elemento com o último elemento
    int temp = vetor[tamanho - 1];
    vetor[tamanho - 1] = vetor[indiceMaior];
    vetor[indiceMaior] = temp;

    // Exibindo o vetor atualizado
    System.out.println("\nVetor com o maior elemento na última posição:");
    for (int num : vetor) {
      System.out.print(num + " ");
    }
    System.out.println();

    sc.close();
  }
}
