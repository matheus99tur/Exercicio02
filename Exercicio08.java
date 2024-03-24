public class Exercicio08 {
  public static void executar() {
    int[] vetorA = { 1, 2, 3, 4, 5 };
    int[] vetorB = { 6, 7, 8, 9, 10 };
    int tamanhoC = vetorA.length + vetorB.length;
    int[] vetorC = new int[tamanhoC];

    for (int i = 0; i < vetorA.length; i++) {
      vetorC[i] = vetorA[i];
    }

    for (int i = 0; i < vetorB.length; i++) {
      vetorC[vetorA.length + i] = vetorB[i];
    }

    System.out.println("Vetor C (concatenado):");
    for (int num : vetorC) {
      System.out.print(num + " ");
    }
  }
}
