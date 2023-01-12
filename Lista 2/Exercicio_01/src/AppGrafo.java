import components.Grafo;
import java.util.Scanner;

public class AppGrafo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Grafo grafo = new Grafo();

        int verticeI, verticeJ, verticeK;

        System.out.println("Insira valores inteiros de 1 a 5...");
        System.out.println();

        do {

            System.out.println("Determinar se dois vértices são vizinhos...");
            System.out.print("1º Vértice: ");
            verticeI = scan.nextInt();
            System.out.print("2º Vértice: ");
            verticeJ = scan.nextInt();

            System.out.println();

            System.out.print("Listar todos os vizinhos do vértice: ");
            verticeK = scan.nextInt();

        } while (verticeI < 1 || verticeI > 5 ||
                verticeJ < 1 || verticeJ > 5 ||
                verticeJ < 1 || verticeJ > 5);

        grafo.imprimirGrafo();
        grafo.verificarSeVizinhos(verticeI, verticeJ);
        grafo.listarVerticesVizinhos(verticeK);

        scan.close();
    }
}
