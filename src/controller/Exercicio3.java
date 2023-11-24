package controller;

public class Exercicio3 {
    public void exibirArestas(int[][] grafo) {
        exibirMatriz(grafo);

        int tamanho = grafo.length;
        for (int x = 0; x < tamanho; x++) {
            for (int y = 0; y < tamanho; y++) {
                if (grafo[x][y] != 0)
                    System.out.println("Aresta[" + x + "," + y + "] = peso[" + grafo[x][y] + "]");
            }
        }
    }

    public void exibirMatriz(int[][] grafo) {
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                System.out.print(grafo[x][y] + " ");
            }
            System.out.println();
        }
    }
}
