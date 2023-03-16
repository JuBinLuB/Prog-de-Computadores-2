package components;

public class ProdutorFactory {

    public static CarroFactory getFactory(String fabrica) {

        if (fabrica.equalsIgnoreCase("Fiat")) {
            return new FiatFactory();
        } else if (fabrica.equalsIgnoreCase("Ford")) {
            return new FordFactory();
        }
        return null;
    }
}
