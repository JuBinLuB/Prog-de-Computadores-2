package test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import components.b.MenuB;
import components.b.Produto;

public class AppLetraB {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Set<Produto> produtos = new HashSet<>();

        MenuB.painel(produtos, scan);

        scan.close();
    }
}
