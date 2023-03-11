package components;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Operations {

    private static boolean validar;

    public static int dividir(int p, int q) throws ArithmeticException {
        return p / q;
    }

    public static void leitura() throws InputMismatchException {

        Scanner scan = new Scanner(System.in);

        Operations.validar = false;

        do {

            System.out.print("Numerador: ");
            int p = scan.nextInt();
            System.out.print("Denominador: ");
            int q = scan.nextInt();

            try {

                double r = dividir(p, q);
                System.out.println("\nResultado: " + r);

                Operations.validar = true;
            } catch (ArithmeticException e) {
                e.printStackTrace();
                scan.nextLine();
            }

        } while (!validar);

        scan.close();
    }
}
