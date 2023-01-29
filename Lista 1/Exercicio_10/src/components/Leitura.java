package components;

import java.util.Scanner;

public class Leitura {

    static Scanner scan = new Scanner(System.in);

    public static int lerTeclado() {
        System.out.print("Digite um número: ");
        return scan.nextInt();
    }
}