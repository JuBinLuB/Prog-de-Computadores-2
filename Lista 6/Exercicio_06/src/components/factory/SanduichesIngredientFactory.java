package components.factory;

import components.product.PaoIF;
import components.product.PresuntoIF;
import components.product.QueijoIF;
import components.product.SaladaIF;

public interface SanduichesIngredientFactory {

    PaoIF criarPao();

    QueijoIF criarQueijo();

    PresuntoIF criarPresunto();

    SaladaIF criarSalada();
}
