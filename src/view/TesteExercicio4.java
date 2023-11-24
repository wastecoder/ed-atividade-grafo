package view;

import controller.Exercicio4;

import java.io.IOException;

public class TesteExercicio4 {
    public static void main(String[] args) throws IOException {
        Exercicio4 exercicio4 = new Exercicio4();

        System.out.println("A matriz vem do arquivo \"entrada.txt\"");
        exibirMatriz(exercicio4.preencherTrianguloSuperior());
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
}
