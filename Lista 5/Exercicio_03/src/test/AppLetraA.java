package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class AppLetraA {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>(50);

        // Adicionando 50 números aleatórios no intervalo de [0, 99].
        for (int i = 0; i < 50; i++) {
            lista.add(ThreadLocalRandom.current().nextInt(0, 99));
        }

        // Imprimindo a lista.
        System.out.println("Lista: ");
        System.out.println(lista);
        System.out.println();

        // i) Obtendo o maior e o menor elemento.
        System.out.println("Maior elemento da lista: " + Collections.max(lista));
        System.out.println("Maior elemento da lista: " + Collections.min(lista));

        // ii) Número de vezes em que o menor elemento apareceu na coleção.
        System.out.print("Vezes que o menor número apareceu na coleção: ");
        System.out.println(Collections.frequency(lista, Collections.min(lista)));
        System.out.println();

        // iii) Ordenando a lista em ordem crescente.
        Collections.sort(lista);
        System.out.println("Lista em ordem crescente:");
        System.out.println(lista);
    }
}
