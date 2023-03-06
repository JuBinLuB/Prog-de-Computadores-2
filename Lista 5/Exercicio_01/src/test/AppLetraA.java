package test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import components.a.Menu;

public class AppLetraA {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Set<String> nomes = new HashSet<>();

        Menu.painel(nomes, scan);

        System.out.println(nomes);
        scan.close();
    }
}
