package controller;

import java.util.ArrayList;
import java.util.LinkedList;

public class Exercicio1 {
    public void quantidadeArestas(int[][] grafo) {
        int tamanho = grafo.length;

        for (int x = 0; x < tamanho; x++) {
            for (int y = 0; y < tamanho; y++) {
                if (grafo[x][y] != 0) {
                    System.out.print("{" + x + "," + y + "}, ");
                }
            }
        }
        System.out.println();
    }

    public void direcionadoOuNao(int[][] grafo) {
        int tamanho = grafo.length;
        boolean grafoDirecionado = false;

        for (int x = 0; x < tamanho; x++) {
            for (int y = 0; y < tamanho; y++) {
                if (grafo[x][y] != grafo[y][x]) {
                    grafoDirecionado = true;
                    x = y = grafo.length + 1; //break
                }
            }
        }

        if (grafoDirecionado) {
            System.out.println("O grafo � direcionado");
        } else {
            System.out.println("O grafo n�o � direcionado");
        }
    }

    public void grauDeCadaVertice(int[][] grafo) {
        int tamanho = grafo.length;
        int grauDoVertice = 0;

        for (int x = 0; x < tamanho; x++) {
            for (int y = 0; y < tamanho; y++) {
                if (grafo [x][y] != 0) grauDoVertice++;
            }
            System.out.println("Grau do v�rtice [" + x + "] = " + grauDoVertice);
            grauDoVertice = 0;
        }
    }

    public void conexoOuDesconexo(int[][] grafo) {
        boolean desconexo = false;
        int i;

        for (i = 0; i < grafo.length; i++) {
            if (todasLinhasEColunasZeradas(grafo, i)) {
                desconexo = true;
                break;
            }
        }

        if (desconexo) {
            System.out.println("Grafo � desconexo por causa do " + (i + 1) + "� v�rtice.");
        } else {
            System.out.println("Grafo � conexo");
        }
    }

    private boolean todasLinhasEColunasZeradas(int[][] grafo, int vertice) {
        // Verificar a linha correspondente ao v�rtice
        for (int i = 0; i < grafo.length; i++) {
            if (grafo[vertice][i] != 0) {
                // Se encontrar um elemento diferente de zero, o v�rtice � conexo
                return false;
            }
        }

        // Verificar a coluna correspondente ao v�rtice
        for (int i = 0; i < grafo.length; i++) {
            if (grafo[i][vertice] != 0) {
                // Se encontrar um elemento diferente de zero, o v�rtice � conexo
                return false;
            }
        }

        // Se todas as verifica��es passaram, o v�rtice � desconexo
        return true;
    }

    public void ciclicoOuAciclico(int[][] grafo) {
        boolean ciclico = false;
        int vertices = grafo.length;
        boolean[] visitado = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            if (!visitado[i] && possuiCicloRecursiva(grafo, i, -1, visitado)) {
                ciclico = true;
                break;
            }
        }

        if (ciclico) {
            System.out.println("O grafo � c�clico");
        } else {
            System.out.println("O grafo � ac�clico");
        }
    }

    private static boolean possuiCicloRecursiva(int[][] grafo, int verticeAtual, int pai, boolean[] visitado) {
        visitado[verticeAtual] = true;

        for (int vizinho = 0; vizinho < grafo.length; vizinho++) {
            if (grafo[verticeAtual][vizinho] == 1) {
                if (!visitado[vizinho]) {
                    if (possuiCicloRecursiva(grafo, vizinho, verticeAtual, visitado)) {
                        return true;
                    }
                } else if (vizinho != pai) {
                    return true;
                }
            }
        }

        return false;
    }

    public void listaAdjacencia(int[][] matriz) {
        int tamanho = matriz.length;
        ArrayList<LinkedList<Integer>> arestas = new ArrayList<>(tamanho);

        for (int x = 0; x < tamanho; x++) {
            arestas.add(new LinkedList<>());

            for (int y = 0; y < tamanho; y++) {
                if (matriz[x][y] == 1) {
                    arestas.get(x).add(y);
                }
            }

            System.out.println(x + " >>> " + arestas.get(x).toString());
        }
    }
}
