package controller;

import java.util.ArrayList;
import java.util.LinkedList;

public class Exercicio2 {
    public int[][] grafoCompleto(int numeroVertices) {
        int[][] grafo = new int[numeroVertices][numeroVertices];

        for (int x = 0; x < numeroVertices; x++) {
            for (int y = 0; y < numeroVertices; y++) {
                if (x == y) grafo[x][y] = 0;
                else grafo[x][y] = 1;
            }
        }

        return grafo;
    }

    public ArrayList<LinkedList<Integer>> listaAdjacencia(int[][] matriz) {
        int tamanho = matriz.length;
        ArrayList<LinkedList<Integer>> arestas = new ArrayList<>(tamanho);

        for (int x = 0; x < tamanho; x++) {
            arestas.add(new LinkedList<>());

            for (int y = 0; y < tamanho; y++) {
                if (matriz[x][y] == 1) {
                    arestas.get(x).add(y);
                }
            }
        }

        return arestas;
    }
}
