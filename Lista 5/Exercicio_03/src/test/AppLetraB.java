package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import components.b.DateComparator;
import components.b.Empregados;
import components.b.Funcionalidade;
import components.b.NameComparator;

public class AppLetraB {
    public static void main(String[] args) {

        List<Empregados> lista = new ArrayList<>();
        lista.add(new Empregados(1254L, "Mark Zuckerberg", 15000, LocalDate.of(2004, 01, 04)));
        lista.add(new Empregados(1255L, "Daniel Ek", 5000, LocalDate.of(2008, 10, 07)));
        lista.add(new Empregados(1253L, "Elon Musk", 100000, LocalDate.of(2022, 04, 25)));
        lista.add(new Empregados(1252L, "Steve Jobs", 10000, LocalDate.of(1997, 01, 30)));

        // Imprimindo a lista na ordem de inserção.
        System.out.println("Lista de Empregados:");
        Funcionalidade.exibirLista(lista);

        // i) Ordenar os funcionários pelo salário.
        System.out.println("Lista ordenada pelo salário:");
        Collections.sort(lista);
        Funcionalidade.exibirLista(lista);

        // ii) Ordenar os funcionários em ordem alfabética.
        System.out.println("Lista em ordem alfabética:");
        Collections.sort(lista, new NameComparator());
        Funcionalidade.exibirLista(lista);

        // iii) Exibir o funcionário de maior salário e o de menor.
        System.out.println("Funcionário com o maior salário: " + Collections.max(lista));
        System.out.println();
        System.out.println("Funcionário com o menor salário: " + Collections.min(lista));
        System.out.println();
        System.out.println("------------------");

        // iv) Exibir o funcionário mais experiente e o menos experiente.
        System.out.println("Funcionário mais experiente: " + Collections.min(lista, new DateComparator()).getNome());
        System.out.println("Funcionário menos experiente: " + Collections.max(lista, new DateComparator()).getNome());
        System.out.println();
    }
}
