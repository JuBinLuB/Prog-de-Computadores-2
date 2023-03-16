package components.factory;

import components.car.Palio;
import components.car.Siena;
import components.typecar.CarroPopular;
import components.typecar.CarroSedan;

public class FiatFactory extends CarroFactory {

    @Override
    public CarroSedan criarCarroSedan() {
        return new Siena();
    }

    @Override
    public CarroPopular criarCarroPopular() {
        return new Palio();
    }

}
