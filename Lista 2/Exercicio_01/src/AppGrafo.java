import components.Grafos;
import java.util.Scanner;

public class AppGrafo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Grafos grafo = new Grafos();

        int verticeI;
        int verticeJ;
        int verticeK;

        System.out.println("Insira valores inteiros de 1 a 5, para...");

        do {

            System.out.println();

            System.out.println("Determinar se dois vértices são vizinhos...");
            System.out.print("1º Vértice: ");
            verticeI = scan.nextInt();
            System.out.print("2º Vértice: ");
            verticeJ = scan.nextInt();

            System.out.println();

            System.out.print("Listar todos os vizinhos do vértice: ");
            verticeK = scan.nextInt();

            System.out.println();

        } while (verticeI < 1 || verticeI > 5 ||
                verticeJ < 1 || verticeJ > 5 ||
                verticeK < 1 || verticeK > 5);

        grafo.exibirGrafo();
        grafo.verificarSeVizinhos(verticeI, verticeJ);
        grafo.listarVerticesVizinhos(verticeK);

        scan.close();
    }
}
