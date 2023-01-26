package components;

import java.util.Scanner;

public class LerDados {

    static Scanner Scan = new Scanner(System.in);

    public static int lerJogada(String coordenada) {
        System.out.print(coordenada + ": ");
        return Scan.nextInt();
    }
}
