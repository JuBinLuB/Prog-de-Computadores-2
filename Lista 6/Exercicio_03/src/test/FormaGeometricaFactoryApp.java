package test;

import components.FormaGeometrica;
import components.FormaGeometricaFactory;

public class FormaGeometricaFactoryApp {
    public static void main(String[] args) {

        FormaGeometrica forma = FormaGeometricaFactory.getFormaGeometrica("circulo");
        forma.desenhar();
    }
}
