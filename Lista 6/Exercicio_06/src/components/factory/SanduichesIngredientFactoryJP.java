package components.factory;

import components.ingredients.PaoFrances;
import components.ingredients.PresuntoFrango;
import components.ingredients.QueijoMussarela;
import components.ingredients.SaladaComVerdura;
import components.product.PaoIF;
import components.product.PresuntoIF;
import components.product.QueijoIF;
import components.product.SaladaIF;

public class SanduichesIngredientFactoryJP implements SanduichesIngredientFactory {

    @Override
    public PaoIF criarPao() {
        return new PaoFrances();
    }

    @Override
    public QueijoIF criarQueijo() {
        return new QueijoMussarela();
    }

    @Override
    public PresuntoIF criarPresunto() {
        return new PresuntoFrango();
    }

    @Override
    public SaladaIF criarSalada() {
        return new SaladaComVerdura();
    }

}
