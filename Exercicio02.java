import java.util.Scanner;

public class Exercicio02 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o tamanho do vetor: ");
    int tamanho = scanner.nextInt();
    int[] numeros = new int[tamanho];

    for (int i = 0; i < tamanho; i++) {
      System.out.print("Digite o número na posição " + i + ": ");
      numeros[i] = scanner.nextInt();
    }

    for (int i = 0; i < tamanho; i++) {
      int numero = numeros[i];
      if (numero > 0) {
        System.out.println("O número " + numero + " na posição " + i + " é positivo.");
      } else if (numero < 0) {
        System.out.println("O número " + numero + " na posição " + i + " é negativo.");
      } else {
        System.out.println("O número " + numero + " na posição " + i + " é zero.");
      }
    }

    scanner.close();
  }
}
