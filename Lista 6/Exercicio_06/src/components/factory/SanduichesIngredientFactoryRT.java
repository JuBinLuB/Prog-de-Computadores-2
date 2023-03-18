package components.factory;

import components.ingredients.PaoBola;
import components.ingredients.PresuntoPeru;
import components.ingredients.QueijoCheddar;
import components.ingredients.SaladaSemVerdura;
import components.product.PaoIF;
import components.product.PresuntoIF;
import components.product.QueijoIF;
import components.product.SaladaIF;

public class SanduichesIngredientFactoryRT implements SanduichesIngredientFactory {

    @Override
    public PaoIF criarPao() {
        return new PaoBola();
    }

    @Override
    public QueijoIF criarQueijo() {
        return new QueijoCheddar();
    }

    @Override
    public PresuntoIF criarPresunto() {
        return new PresuntoPeru();
    }

    @Override
    public SaladaIF criarSalada() {
        return new SaladaSemVerdura();
    }

}
