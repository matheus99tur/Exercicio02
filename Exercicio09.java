import java.util.Scanner;

public class Exercicio09 {
  public static void executar() {
    Scanner sc = new Scanner(System.in);

    int[] vetorA = new int[5];
    int[] vetorB = new int[5];
    int[] vetorC = new int[5];

    System.out.println("Digite os elementos do vetor A:");
    for (int i = 0; i < vetorA.length; i++) {
      vetorA[i] = sc.nextInt();
    }

    System.out.println("Digite os elementos do vetor B:");
    for (int i = 0; i < vetorB.length; i++) {
      vetorB[i] = sc.nextInt();
    }

    for (int i = 0; i < vetorC.length; i++) {
      if (i % 2 == 0) { // Posições pares
        vetorC[i] = vetorA[i];
      } else { // Posições ímpares
        vetorC[i] = vetorB[i];
      }
    }

    System.out.println("Vetor C gerado:");
    for (int num : vetorC) {
      System.out.print(num + " ");
    }

    sc.close();
  }
}
