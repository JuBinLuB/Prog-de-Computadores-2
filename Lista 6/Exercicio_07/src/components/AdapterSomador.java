package components;

import java.util.ArrayList;
import java.util.List;

public class AdapterSomador implements SomadorEsperado {

    private SomadorExistente somador;

    public AdapterSomador(SomadorExistente somador) {
        this.somador = somador;
    }

    @Override
    public int somaVetor(int[] vetor) {

        List<Integer> lista = new ArrayList<>();

        for (int i : vetor) {
            lista.add(i);
        }
        return somador.somaLista(lista);
    }
}
