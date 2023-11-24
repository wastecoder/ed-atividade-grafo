# Atividade de Grafo
Resolve exercícios envolvendo grafos em geral

## Descrição do exercício

1\) Escreva um programa para ler como entrada uma *matriz de adjacências* de um grafo e responder as seguintes perguntas:

    A) Quais são as arestas do grafo?
    B) É um dígrafo ou um grafo não-direcionado?
    C) Qual é o grau de cada vértice?
    D) O grafo é conexo ou desconexo?
    E) O grafo é cíclico ou acíclico?
    F) Qual é a lista de adjacências do mesmo grafo?

2\) Escreva um programa que receba como entrada um número inteiro n correspondente ao número de vértices e apresente como saída a matriz e a lista de adjacências para o grafo completo Kn.

3\) Escreva um programa que receba como entrada uma matriz de adjacências de um grafo simples, ponderado e conexo e escreva como saída as arestas (na forma de pares ordenados e seus pesos).

4\) Escreva um programa que receba como entrada uma matriz de adjacências para o grafo não-direcionado em *sua forma triangular inferior*, conforme ilustrado abaixo e retorne a matriz completa, obtendo a parte superior considerando a simetria.<br>

0<br>
1 0<br>
0 1 0<br>
0 1 1 0<br>
1 1 0 1 0<br>
0 0 1 1 1 0<br>

**Dica:** faça a entrada como um arquivo de texto (entrada.txt) no formato abaixo, onde a primeira linha indica a dimensão da matriz quadrada e as linhas abaixo são os elementos de cada posição da matriz.<br>
6<br>
0 1 0 0 1 0<br>
1 0 1 1 1 0<br>
0 1 0 1 0 1<br>
0 1 1 0 1 1<br>
1 1 0 1 0 1<br>
0 0 1 1 1 0<br>
