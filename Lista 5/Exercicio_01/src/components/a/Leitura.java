package components.a;

import java.util.Scanner;
import java.util.Set;

public class Leitura {

    private static boolean lendo;
    private static String elemento;

    public static void leitura(Set<String> nomes, Scanner scan) {

        System.out.println("Digite \"sair\" para retornar ao Menu.");
        System.out.println();

        Leitura.lendo = true;
        int i = 1;

        do {

            System.out.print(i + "º elemento: ");
            Leitura.elemento = scan.nextLine();

            if (Leitura.elemento.equals("sair")) {
                Leitura.lendo = false;
            } else {
                nomes.add(Leitura.elemento);
            }

            i++;
        } while (Leitura.lendo);
    }
}
