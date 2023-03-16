package test;

import components.Sanduiche;
import components.SanduicheFactory;

public class SanduicheFactoryApp {
    public static void main(String[] args) {

        Sanduiche sanduiche = SanduicheFactory.getSanduiche("sanduiche rt");
        sanduiche.preparar();
    }
}
