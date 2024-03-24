import java.util.Scanner;

public class Exercicio11 {
  public static void executar() {
    Scanner sc = new Scanner(System.in);

    int[] vetor1 = new int[5];
    int[] vetor2 = new int[5];
    int produtoEscalar = 0;

    // Entrada de dados para o vetor1
    System.out.println("Digite os elementos do primeiro vetor:");
    for (int i = 0; i < vetor1.length; i++) {
      vetor1[i] = sc.nextInt();
    }

    // Entrada de dados para o vetor2
    System.out.println("Digite os elementos do segundo vetor:");
    for (int i = 0; i < vetor2.length; i++) {
      vetor2[i] = sc.nextInt();
    }

    // Calculando o produto escalar
    for (int i = 0; i < vetor1.length; i++) {
      produtoEscalar += vetor1[i] * vetor2[i];
    }

    // Exibindo o resultado
    System.out.println("O produto escalar dos vetores é: " + produtoEscalar);

    sc.close();
  }
}
