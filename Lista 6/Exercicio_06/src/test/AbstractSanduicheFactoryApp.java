package test;

import components.Lanchonete;
import components.Sandwich;
import components.factory.ProdutorSanduicheFactory;
import components.factory.SanduichesIngredientFactory;

public class AbstractSanduicheFactoryApp {
    public static void main(String[] args) {

        // Selecionando a fábrica.
        SanduichesIngredientFactory fabricaCG = ProdutorSanduicheFactory.getSanduicheFactory("Fabrica CG");
        SanduichesIngredientFactory fabricaJP = ProdutorSanduicheFactory.getSanduicheFactory("Fabrica JP");
        SanduichesIngredientFactory fabricaRT = ProdutorSanduicheFactory.getSanduicheFactory("Fabrica RT");

        // Solicitando a montagem do Sanduiche à Lanchonete.
        Lanchonete lanchoneteCG = new Lanchonete(fabricaCG);
        Lanchonete lanchoneteJP = new Lanchonete(fabricaJP);
        Lanchonete lanchoneteRT = new Lanchonete(fabricaRT);

        // Recebendo o Sanduiche pronto.
        Sandwich sanduicheCG = lanchoneteCG.montarSanduiche();
        Sandwich sanduicheJP = lanchoneteJP.montarSanduiche();
        Sandwich sanduicheRT = lanchoneteRT.montarSanduiche();

        // Exibindo o sanduiche pós montagem.
        System.out.println(sanduicheCG);
        System.out.println(sanduicheJP);
        System.out.println(sanduicheRT);
    }
}
