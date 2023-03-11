package components;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExceptionRethrow {

    public static void someMethod(List<String> fellowship)
            throws InputMismatchException, IndexOutOfBoundsException {

        try {
            someMethod2(fellowship);
        } catch (InputMismatchException | IndexOutOfBoundsException e) {
            throw e;
        }
    }

    public static void someMethod2(List<String> fellowship)
            throws InputMismatchException, IndexOutOfBoundsException {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int i = scan.nextInt();

        System.out.println(i + "º membro da Sociedade do Anel: " + fellowship.get(i - 1));
        scan.close();
    }
}
