package components;

import java.util.Random;
import java.util.Scanner;

public class Grafos {

    Random rand = new Random();

    private boolean[][] grafo;

    private static int verticeX;
    private static int verticeY;
    private static int verticeZ;

    public Grafos() {

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

    public static int getVerticeX() {
        return verticeX;
    }

    public static void setVerticeX(int verticeX) {
        Grafos.verticeX = verticeX;
    }

    public static int getVerticeY() {
        return verticeY;
    }

    public static void setVerticeY(int verticeY) {
        Grafos.verticeY = verticeY;
    }

    public static int getVerticeZ() {
        return verticeZ;
    }

    public static void setVerticeZ(int verticeZ) {
        Grafos.verticeZ = verticeZ;
    }

    public void verificarSeVizinhos(int verticeI, int verticeJ) {

        if (this.grafo[verticeI - 1][verticeJ - 1]) {
            System.out.println("Os vértices " + verticeI + " e " + verticeJ + " são vizinhos.");
        } else {
            System.out.println("Os vértices " + verticeI + " e " + verticeJ + " não são vizinhos.");
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

    public void exibirGrafo() {

        System.out.println("Matriz de adjascência do Grafo:");

        for (int i = 0; i < this.grafo.length; i++) {
            for (int j = 0; j < this.grafo[i].length; j++) {

                System.out.print((this.grafo[i][j] ? 1 : 0) + " ");
            }

            System.out.println();
        }

        System.out.println();
    }

    public static void leitura() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira valores inteiros de 1 a 5...");
        do {

            System.out.print("1º Vértice: ");
            setVerticeX(scan.nextInt());

            do {

                System.out.print("2º Vértice: ");
                setVerticeY(scan.nextInt());

            } while (getVerticeY() == getVerticeX());

            System.out.print("3º Vértice: ");
            setVerticeZ(scan.nextInt());

        } while (getVerticeX() < 1 || getVerticeX() > 5 ||
                getVerticeY() < 1 || getVerticeY() > 5 ||
                getVerticeZ() < 1 || getVerticeZ() > 5);

        System.out.println();
        scan.close();
    }
}
