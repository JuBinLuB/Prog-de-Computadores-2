package components.factory;

import components.product.PaoIF;
import components.product.PresuntoIF;
import components.product.QueijoIF;
import components.product.SaladaIF;

public class SanduichesIngredientFactoryRT implements SanduichesIngredientFactory {

    @Override
    public PaoIF criarPao() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'criarPao'");
    }

    @Override
    public QueijoIF criarQueijo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'criarQueijo'");
    }

    @Override
    public PresuntoIF criarPresunto() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'criarPresunto'");
    }

    @Override
    public SaladaIF criarSalada() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'criarSalada'");
    }

}
