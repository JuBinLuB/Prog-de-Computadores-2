package test;

import components.factory.CarroFactory;
import components.factory.ProdutorFactory;
import components.typecar.CarroPopular;
import components.typecar.CarroSedan;

public class AbstractFactoryApp {
    public static void main(String[] args) {

        CarroFactory fiatFactory = ProdutorFactory.getFactory("Fiat");
        CarroFactory fordFactory = ProdutorFactory.getFactory("Ford");

        // Construindo Carros Sedan.
        CarroSedan siena = fiatFactory.criarCarroSedan();
        CarroSedan fiestaSedan = fordFactory.criarCarroSedan();

        // Construíndo Carros Populares.
        CarroPopular palio = fiatFactory.criarCarroPopular();
        CarroPopular fiesta = fordFactory.criarCarroPopular();

        // Exibindo informações dos Carros Sedan.
        siena.exibirInfoSedan();
        fiestaSedan.exibirInfoSedan();

        // Exibindo informações dos Carros Populares.
        palio.exibirInfoPopular();
        fiesta.exibirInfoPopular();
    }
}
