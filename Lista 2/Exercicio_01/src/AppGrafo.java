import components.Grafo;

public class AppGrafo {
    public static void main(String[] args) {

        Grafo grafo = new Grafo();

        grafo.imprimirGrafo();
        grafo.verificarVizinhos(1, 4);
        grafo.listarVizinhos(3);
    }
}
