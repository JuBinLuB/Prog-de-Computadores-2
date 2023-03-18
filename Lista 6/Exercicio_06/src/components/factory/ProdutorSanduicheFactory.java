package components.factory;

public class ProdutorSanduicheFactory {

    public static SanduichesIngredientFactory getSanduicheFactory(String fabrica) {

        if (fabrica.equalsIgnoreCase("Fabrica CG")) {
            return new SanduichesIngredientFactoryCG();
        } else if (fabrica.equalsIgnoreCase("Fabrica JP")) {
            return new SanduichesIngredientFactoryJP();
        } else if (fabrica.equalsIgnoreCase("Fabrica RT")) {
            return new SanduichesIngredientFactoryRT();
        }
        return null;
    }
}
