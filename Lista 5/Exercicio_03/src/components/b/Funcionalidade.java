package components.b;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Funcionalidade {

    public static void ordenar(List<Empregados> lista) {

        Collections.sort(lista);
        for (Empregados e : lista) {
            System.out.println(e);
        }
    }

    public static void ordenar(List<Empregados> lista, Comparator<? super Empregados> c) {

        lista.sort(c);
        for (Empregados e : lista) {
            System.out.println(e);
        }
    }
}
