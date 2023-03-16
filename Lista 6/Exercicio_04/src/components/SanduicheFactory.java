package components;

public abstract class SanduicheFactory {

    public static Sanduiche getSanduiche(String tipo) {

        if (tipo == null) {
            return null;
        }

        if (tipo.equalsIgnoreCase("Sanduiche CG")) {
            return new LanchoneteCG();
        } else if (tipo.equalsIgnoreCase("Sanduiche JP")) {
            return new LanchoneteJP();
        } else if (tipo.equalsIgnoreCase("Sanduiche RT")) {
            return new LanchoneteRT();
        }
        return null;
    }
}
