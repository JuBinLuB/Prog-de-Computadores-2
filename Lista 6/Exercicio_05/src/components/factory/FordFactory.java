package components.factory;

import components.car.Fiesta;
import components.car.FiestaSedan;
import components.typecar.CarroPopular;
import components.typecar.CarroSedan;

public class FordFactory extends CarroFactory {

    @Override
    public CarroSedan criarCarroSedan() {
        return new FiestaSedan();
    }

    @Override
    public CarroPopular criarCarroPopular() {
        return new Fiesta();
    }

}
