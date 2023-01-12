package components;

import java.util.Random;

public class Grafo {

    Random rand = new Random();

    private boolean[][] grafo;

    public Grafo() {

        this.grafo = new boolean[5][5];

        for (int i = 0; i < this.grafo.length; i++) {
            for (int j = 0; j < this.grafo[i].length; j++) {

                this.grafo[i][j] = rand.nextBoolean();
                this.grafo[i][i] = false;
            }
        }

        for (int i = 0; i < this.grafo.length; i++) {
            for (int j = 0; j < this.grafo.length; j++) {

                if (this.grafo[i][j]) {
                    this.grafo[j][i] = true;
                }
            }
        }
    }

    public void verificarSeVizinhos(int verticeI, int verticeJ) {

        if (this.grafo[verticeI - 1][verticeJ - 1]) {
            System.out.println("Os vértices " + verticeI + " e " + verticeJ + " são vizinhos.");
        } else {
            System.out.println("Os vértices " + verticeJ + " e " + verticeJ + " não são vizinhos.");
        }
    }

    public void listarVerticesVizinhos(int vertice) {

        System.out.print("Os vértices vizinhos de " + vertice + " são: ");

        for (int i = 0; i < this.grafo.length; i++) {

            if (this.grafo[vertice - 1][i]) {
                System.out.print((i + 1) + " ");
            }
        }

        System.out.println();
    }

    public void imprimirGrafo() {

        System.out.println("Matriz de adjascência do Grafo:");

        for (int i = 0; i < this.grafo.length; i++) {
            for (int j = 0; j < this.grafo[i].length; j++) {
                System.out.print((this.grafo[i][j] ? 1 : 0) + " ");
            }

            System.out.println();
        }

        System.out.println();
    }
}
