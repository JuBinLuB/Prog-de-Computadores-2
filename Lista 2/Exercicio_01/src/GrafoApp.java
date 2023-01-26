import components.Grafos;
import components.LerTeclado;

public class GrafoApp {
    public static void main(String[] args) {

        Grafos grafo = new Grafos();

        LerTeclado.leitura();

        grafo.exibirGrafo();
        grafo.verificarSeVizinhos(LerTeclado.getVerticeX(), LerTeclado.getVerticeY());
        grafo.listarVerticesVizinhos(LerTeclado.getVerticeZ());
    }
}
