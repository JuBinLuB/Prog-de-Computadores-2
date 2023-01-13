import components.Grafos;

public class GrafoApp {
    public static void main(String[] args) {

        Grafos grafo = new Grafos();

        Grafos.leitura();

        grafo.exibirGrafo();
        grafo.verificarSeVizinhos(Grafos.getVerticeX(), Grafos.getVerticeY());
        grafo.listarVerticesVizinhos(Grafos.getVerticeZ());
    }
}
