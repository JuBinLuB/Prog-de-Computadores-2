package test;

import components.FormaFactory;
import components.FormaGeometrica;

public class FormaGeometricaFactoryApp {
    public static void main(String[] args) {

        FormaGeometrica forma = FormaFactory.getFormaGeometrica("circulo");
        forma.desenhar();
    }
}
