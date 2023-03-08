package components.b;

import java.util.List;

public class Funcionalidade {

    public static void exibirLista(List<Empregados> lista) {

        for (Empregados e : lista) {
            System.out.println(e);
        }
        System.out.println("------------------");
        System.out.println();
    }
}
