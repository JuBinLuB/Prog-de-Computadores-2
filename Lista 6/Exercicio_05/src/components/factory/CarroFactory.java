package components.factory;

import components.typecar.CarroPopular;
import components.typecar.CarroSedan;

public abstract class CarroFactory {

    public abstract CarroSedan criarCarroSedan();

    public abstract CarroPopular criarCarroPopular();
}
