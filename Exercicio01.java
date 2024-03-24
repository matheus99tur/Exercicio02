import java.util.Scanner;

public class Exercicio01 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    int tamanho = 5;
    int[] numeros = new int[tamanho];

    for (int i = 0; i < tamanho; i++) {
      System.out.print("Digite o número " + (i + 1) + ": ");
      numeros[i] = scanner.nextInt();
    }

    double soma = 0;
    for (int numero : numeros) {
      soma += numero;
    }
    double media = soma / tamanho;

    System.out.println("A média dos números é: " + media);

    System.out.println("Valores menores que a média:");
    for (int numero : numeros) {
      if (numero < media) {
        System.out.println(numero);
      }
    }

    System.out.println("Valores iguais à média:");
    for (int numero : numeros) {
      if (numero == media) {
        System.out.println(numero);
      }
    }

    System.out.println("Valores maiores que a média:");
    for (int numero : numeros) {
      if (numero > media) {
        System.out.println(numero);
      }
    }

    scanner.close();
  }
}
