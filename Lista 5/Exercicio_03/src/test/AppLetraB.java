package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import components.b.DataComparator;
import components.b.Empregados;
import components.b.Funcionalidade;
import components.b.NomeComparator;

public class AppLetraB {
    public static void main(String[] args) {

        List<Empregados> lista = new ArrayList<>();
        lista.add(new Empregados(1254L, "Mark Zuckerberg", 15000, LocalDate.of(2004, 01, 04)));
        lista.add(new Empregados(1255L, "Daniel Ek", 5000, LocalDate.of(2008, 10, 07)));
        lista.add(new Empregados(1253L, "Elon Musk", 100000, LocalDate.of(2022, 04, 25)));
        lista.add(new Empregados(1252L, "Steve Jobs", 10000, LocalDate.of(1997, 01, 30)));

        // Imprimindo a lista na ordem de inserção.
        System.out.println("Lista de Empregados:");
        for (Empregados e : lista) {
            System.out.println(e);
        }

        System.out.println("\n-------------------------------------\n");

        // i) Ordenar os funcionários pelo salário.
        System.out.println("Lista ordenada pelo salário:");
        Funcionalidade.ordenar(lista);

        System.out.println("\n-------------------------------------\n");

        // ii) Ordenar os funcionários em ordem alfabética.
        System.out.println("Lista em ordem alfabética:");
        Funcionalidade.ordenar(lista, new NomeComparator());

        System.out.println("\n-------------------------------------\n");

        // iii) Exibir o funcionário de maior salário e o de menor.
        System.out.println("Funcionário com o maior salário: ");
        System.out.println(Collections.max(lista));
        System.out.println();
        System.out.println("Funcionário com o menor salário: ");
        System.out.println(Collections.min(lista));

        System.out.println("\n-------------------------------------\n");

        // iv) Exibir o funcionário mais experiente e o menos experiente.
        System.out.print("Funcionário mais experiente: ");
        System.out.println(Collections.min(lista, new DataComparator()).getNome());
        System.out.print("Funcionário menos experiente: ");
        System.out.println(Collections.max(lista, new DataComparator()).getNome());
    }
}
