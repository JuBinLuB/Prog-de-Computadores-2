package components.ingredients;

import components.product.SaladaIF;

public class SaladaSemVerdura implements SaladaIF {

    @Override
    public String descricao() {
        return "Salada sem verdura";
    }

}
