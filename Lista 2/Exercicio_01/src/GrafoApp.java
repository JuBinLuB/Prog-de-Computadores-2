import components.Grafos;

public class GrafoApp {
    public static void main(String[] args) {

        Grafos grafo = new Grafos();

        grafo.exibirGrafo();
        grafo.verificarSeVizinhos(1, 4);
        grafo.listarVerticesVizinhos(5);
    }
}
