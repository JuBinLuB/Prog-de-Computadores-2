import components.Circulo;
import components.FormaGeometrica;
import components.Quadrado;

public class Exer04App {
    public static void main(String[] args) {

        FormaGeometrica circulo = new Circulo(3.5);
        FormaGeometrica quadrado = new Quadrado(4.55);

        // Testando o Círculo.
        System.out.printf("Área do círculo: %.2f\n", circulo.area());
        System.out.printf("Comprimento do círculo: %.2f\n", circulo.comprimento());
        System.out.println();

        // Testando o Quadrado.
        System.out.printf("Área do quadrado: %.2f\n", quadrado.area());
        System.out.printf("Comprimento do quadrado: %.2f\n", quadrado.comprimento());
    }
}
