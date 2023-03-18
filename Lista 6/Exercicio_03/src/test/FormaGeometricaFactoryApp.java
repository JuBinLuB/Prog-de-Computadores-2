package test;

import components.FormaGeometrica;
import components.FormaGeometricaFactory;

public class FormaGeometricaFactoryApp {
    public static void main(String[] args) {

        FormaGeometrica circulo = FormaGeometricaFactory.getFormaGeometrica("circulo");
        FormaGeometrica quadrado = FormaGeometricaFactory.getFormaGeometrica("quadrado");
        FormaGeometrica triangulo = FormaGeometricaFactory.getFormaGeometrica("triangulo");

        circulo.desenhar();
        quadrado.desenhar();
        triangulo.desenhar();
    }
}
