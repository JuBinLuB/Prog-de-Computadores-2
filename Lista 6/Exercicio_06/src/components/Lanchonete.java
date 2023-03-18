package components;

import components.factory.SanduichesIngredientFactory;
import components.product.PaoIF;
import components.product.PresuntoIF;
import components.product.QueijoIF;
import components.product.SaladaIF;

public class Lanchonete {

    private SanduichesIngredientFactory fabrica;

    public Lanchonete(SanduichesIngredientFactory fabrica) {
        this.fabrica = fabrica;
    }

    public Sandwich montarSanduiche() {

        PaoIF pao = fabrica.criarPao();
        QueijoIF queijo = fabrica.criarQueijo();
        PresuntoIF presunto = fabrica.criarPresunto();
        SaladaIF salada = fabrica.criarSalada();

        return new Sandwich(pao, queijo, presunto, salada);
    }
}
