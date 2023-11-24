package view;

import controller.Exercicio2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class TesteExercicio2 {
    public static void main(String[] args) {
        Exercicio2 exercicio2 = new Exercicio2();
        Scanner leia = new Scanner(System.in);
        int[][] matrizAdjacencia;
        ArrayList<LinkedList<Integer>> listaAdjacencia;

        System.out.print("Digite o número de vértices: ");
        int numeroVertices = leia.nextInt();

        matrizAdjacencia = exercicio2.grafoCompleto(numeroVertices);
        listaAdjacencia = exercicio2.listaAdjacencia(matrizAdjacencia);

        //O main ficaria menor se não pedisse para retornar, assim poderia printar dentro da classe Exercicio2
        exibirMatriz(matrizAdjacencia);
        exibirLista(listaAdjacencia);
    }

    public static void exibirMatriz(int[][] matriz) {
        int tamanho = matriz.length;

        for (int x = 0; x < tamanho; x++) {
            for (int y = 0; y < tamanho; y++) {
                System.out.print(matriz[x][y] + " ");
            }
            System.out.println();
        }
    }

    public static void exibirLista(ArrayList<LinkedList<Integer>> lista) {
        for (int x = 0; x < lista.size(); x++) {
            System.out.println(x + " >>> " + lista.get(x).toString());
        }
    }
}
