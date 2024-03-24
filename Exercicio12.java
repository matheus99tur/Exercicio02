import java.util.Scanner;

public class Exercicio12 {
  public static void executar() {
    Scanner sc = new Scanner(System.in);

    int[] vetor = new int[12];
    int produto = 1;

    // Entrada de dados para o vetor
    System.out.println("Digite os 12 elementos do vetor:");
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = sc.nextInt();
    }

    // Calculando o produto dos elementos pares positivos
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] > 0 && vetor[i] % 2 == 0) {
        produto *= vetor[i];
      }
    }

    // Exibindo o resultado
    if (produto != 1) {
      System.out.println("O produto dos elementos pares positivos é: " + produto);
    } else {
      System.out.println("Não existem elementos pares positivos no vetor.");
    }

    sc.close();
  }
}
