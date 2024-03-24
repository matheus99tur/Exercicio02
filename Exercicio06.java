import java.util.Scanner;

public class Exercicio06 {
  public static void executar() {
    Scanner scanner = new Scanner(System.in);

    // Definindo o tamanho dos vetores
    int tamanho = 5;
    double[] notas = new double[tamanho];
    double[] pesos = new double[tamanho];

    // Lendo as notas do aluno
    System.out.println("Digite as notas do aluno:");
    for (int i = 0; i < tamanho; i++) {
      System.out.print("Nota " + (i + 1) + ": ");
      notas[i] = scanner.nextDouble();
    }

    // Lendo os pesos das notas
    System.out.println("\nDigite os pesos das notas:");
    for (int i = 0; i < tamanho; i++) {
      System.out.print("Peso " + (i + 1) + ": ");
      pesos[i] = scanner.nextDouble();
    }

    // Calculando a média ponderada
    double somaProdutos = 0;
    double somaPesos = 0;
    for (int i = 0; i < tamanho; i++) {
      somaProdutos += notas[i] * pesos[i];
      somaPesos += pesos[i];
    }

    double mediaPonderada = somaProdutos / somaPesos;

    // Exibindo a média ponderada
    System.out.println("\nA média ponderada do aluno é: " + mediaPonderada);

    scanner.close();
  }
}
