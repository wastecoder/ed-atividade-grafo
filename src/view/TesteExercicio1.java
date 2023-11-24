package view;

import controller.Exercicio1;

public class TesteExercicio1 {
    public static void main(String[] args) {
        Exercicio1 exercicio1 = new Exercicio1();
        int[][] grafoNaoDirecionado =
                {
                        {0, 1, 0, 0, 1},
                        {1, 0, 1, 1, 1},
                        {0, 1, 0, 1, 0},
                        {0, 1, 1, 0, 1},
                        {1, 1, 0, 1, 0}
                };
        int[][] grafoDirecionado =
                {
                        {0, 1, 0, 1, 0, 0},
                        {0, 0, 0, 0, 1, 0},
                        {0, 0, 0, 0, 1, 1},
                        {0, 1, 0, 0, 0, 0},
                        {0, 0, 0, 1, 0, 0},
                        {0, 0, 0, 0, 0, 1},
                };


        int[][] grafoDesconexo =
                {
                        {0, 1, 0, 0},
                        {1, 0, 0, 1},
                        {0, 0, 0, 0},
                        {0, 1, 0, 0},
                };
        int[][] grafoConexo =
                {
                        {0, 1, 0, 0},
                        {1, 0, 0, 1},
                        {0, 0, 1, 0},
                        {0, 1, 0, 0},
                };


        int[][] grafoCiclico1 = {
                {0, 1, 0, 1},
                {1, 0, 1, 0},
                {0, 1, 0, 1},
                {1, 0, 1, 0}
        };
        int[][] grafoAciclico1 = {
                {0, 1, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };


        exercicio1.quantidadeArestas(grafoNaoDirecionado);
        exercicio1.quantidadeArestas(grafoDirecionado);

        System.out.println("=========================");
        exercicio1.direcionadoOuNao(grafoNaoDirecionado);
        exercicio1.direcionadoOuNao(grafoDirecionado);

        System.out.println("=========================");
        exercicio1.grauDeCadaVertice(grafoNaoDirecionado);
        System.out.println();
        exercicio1.grauDeCadaVertice(grafoDirecionado);

        System.out.println("=========================");
        exercicio1.listaAdjacencia(grafoNaoDirecionado);
        System.out.println();
        exercicio1.listaAdjacencia(grafoDirecionado);

        System.out.println("=========================");
        exercicio1.conexoOuDesconexo(grafoDesconexo);
        exercicio1.conexoOuDesconexo(grafoConexo);

        System.out.println("=========================");
        exercicio1.ciclicoOuAciclico(grafoCiclico1);
        exercicio1.ciclicoOuAciclico(grafoAciclico1);
    }
}
