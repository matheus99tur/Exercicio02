import java.util.Scanner;

public class Exercicio15 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);
    int[] vetor = new int[5];

    System.out.println("Digite 5 números:");
    vetor[0] = scanner.nextInt(); // Armazena o primeiro número diretamente

    for (int i = 1; i < 5; i++) {
      System.out.print("Digite o próximo número: ");
      int numero = scanner.nextInt();

      // Verifica se o número é maior que o anterior
      if (numero > vetor[i - 1]) {
        vetor[i] = numero; // Armazena o número no vetor
      } else {
        System.out.println("Número inválido! Não é maior que o anterior.");
        i--; // Decrementa o índice para tentar novamente
      }
    }

    System.out.println("\nValores armazenados no vetor:");
    for (int num : vetor) {
      System.out.println(num);
    }

    scanner.close();
  }
}
