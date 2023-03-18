package components.factory;

import components.ingredients.PaoIntegral;
import components.ingredients.PresuntoFrango;
import components.ingredients.QueijoPrato;
import components.ingredients.SaladaSemVerdura;
import components.product.PaoIF;
import components.product.PresuntoIF;
import components.product.QueijoIF;
import components.product.SaladaIF;

public class SanduichesIngredientFactoryCG implements SanduichesIngredientFactory {

    @Override
    public PaoIF criarPao() {
        return new PaoIntegral();
    }

    @Override
    public QueijoIF criarQueijo() {
        return new QueijoPrato();
    }

    @Override
    public PresuntoIF criarPresunto() {
        return new PresuntoFrango();
    }

    @Override
    public SaladaIF criarSalada() {
        return new SaladaSemVerdura();
    }

}
