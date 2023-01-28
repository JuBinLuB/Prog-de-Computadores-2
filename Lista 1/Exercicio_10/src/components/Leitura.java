package components;

import java.util.Scanner;

public class Leitura {

    public static int lerTeclado() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int numero = scan.nextInt();

        scan.close();
        return numero;
    }
}