import java.util.Scanner;

public class Exercicio07 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    // Definindo o tamanho dos vetores
    int tamanho = 5;
    int[] vetor1 = new int[tamanho];
    int[] vetor2 = new int[tamanho];

    // Lendo os elementos do primeiro vetor
    System.out.println("Digite os elementos do primeiro vetor:");
    for (int i = 0; i < tamanho; i++) {
      System.out.print("Elemento " + (i + 1) + ": ");
      vetor1[i] = scanner.nextInt();
    }

    // Lendo os elementos do segundo vetor
    System.out.println("\nDigite os elementos do segundo vetor:");
    for (int i = 0; i < tamanho; i++) {
      System.out.print("Elemento " + (i + 1) + ": ");
      vetor2[i] = scanner.nextInt();
    }

    // Verificando se os vetores são iguais
    boolean iguais = true;
    for (int i = 0; i < tamanho; i++) {
      if (vetor1[i] != vetor2[i]) {
        iguais = false;
        break;
      }
    }

    // Exibindo o resultado
    if (iguais) {
      System.out.println("\nOs vetores são iguais.");
    } else {
      System.out.println("\nOs vetores são diferentes.");
    }

    scanner.close();
  }
}
