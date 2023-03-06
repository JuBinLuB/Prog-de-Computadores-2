package test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import components.b.Produto;
import components.b.Registro;

public class AppLetraB {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Set<Produto> produtos = new HashSet<>();

        Registro.RegistrarProduto(produtos, scan);

        int i = 1;
        for (Produto produto : produtos) {
            System.out.println();
            System.out.println(i + "º Produto..." + produto);
            i++;
        }
    }
}
