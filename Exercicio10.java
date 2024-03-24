import java.util.Scanner;

public class Exercicio10 {
  public static void executar() {
    Scanner sc = new Scanner(System.in);

    int[] vetorA = new int[5];
    int[] vetorB = new int[5];

    System.out.println("Digite os elementos do vetor A:");
    for (int i = 0; i < vetorA.length; i++) {
      vetorA[i] = sc.nextInt();
    }

    for (int i = 0; i < vetorA.length; i++) {
      vetorB[vetorB.length - 1 - i] = vetorA[i];
    }

    System.out.println("Vetor A:");
    for (int num : vetorA) {
      System.out.print(num + " ");
    }

    System.out.println("\nVetor B (cópia invertida de A):");
    for (int num : vetorB) {
      System.out.print(num + " ");
    }

    sc.close();
  }
}
