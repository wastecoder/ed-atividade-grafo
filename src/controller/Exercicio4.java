package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio4 {
    private int[][] preencherMatriz() throws IOException {
        int[][] matriz;
        BufferedReader ler = new BufferedReader(new FileReader("entrada.txt"));

        String linhaArquivo = ler.readLine();
        int tamanho = Integer.parseInt(linhaArquivo);
        matriz = new int[tamanho][tamanho];

        int linhaMatriz = 0;
        while ((linhaArquivo = ler.readLine()) != null) {
            String[] colunas = linhaArquivo.split(" ");

            for (int y = 0; y < colunas.length; y++) {
                matriz[linhaMatriz][y] = Integer.parseInt(colunas[y]);
            }

            linhaMatriz++;
        }

        return matriz;
    }

    public int[][] preencherTrianguloSuperior() throws IOException {
        int[][] grafo = preencherMatriz();

        int tamanho = grafo.length;
        for (int x = 0; x < tamanho; x++) {
            for (int y = 0; y < tamanho; y++) {
                if (valorNoTrianguloInferior(x, y))
                    grafo[y][x] = grafo[x][y];
            }
        }

        return grafo;
    }

    private boolean valorNoTrianguloInferior(int linha, int coluna) {
        return linha > coluna;
    }
}
