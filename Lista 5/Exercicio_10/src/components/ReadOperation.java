package components;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadOperation {

    static Scanner scan = new Scanner(System.in);

    private static boolean validate;
    private static boolean open;
    private static int option;

    public static void operationsPanel() {

        ReadOperation.open = true;

        System.out.println("-------- Operações --------");
        System.out.println("[1] - Divisão");
        System.out.println("[2] - Logaritmo");
        System.out.println("[3] - Encerrar");
        System.out.println();

        ReadOperation.option = reading();
        ReadOperation.validate = false;

        while (!ReadOperation.validate) {
            System.out.println();

            try {
                switch (ReadOperation.option) {

                    case 1:
                        System.out.println("-------- Divisão --------");
                        System.out.print("Numerador: ");
                        int p = scan.nextInt();
                        System.out.print("Denominador: ");
                        int q = scan.nextInt();

                        double r = Calculator.div(p, q);
                        System.out.println("Resultado: " + r);

                        ReadOperation.validate = true;
                        break;

                    case 2:
                        System.out.println("-------- Logaritmo --------");
                        System.out.print("Logaritmando: ");
                        int log = scan.nextInt();

                        double s = Calculator.log10(log);
                        System.out.println("Resultado: " + s);

                        ReadOperation.validate = true;
                        break;

                    case 3:
                        System.out.print("-------- Calculadora encerrada --------");
                        ReadOperation.validate = true;
                        ReadOperation.open = false;
                        break;

                    default:
                        System.out.println("Opção inválida.");
                        break;
                }

            } catch (InvalidOperationException | InputMismatchException e) {
                System.out.println("\nErro: " + e.getMessage());
                e.printStackTrace();
                scan.nextLine();
            }
        }

        System.out.println();

        if (ReadOperation.open) {
            ReadOperation.operationsPanel();
        }
    }

    public static int reading() {

        ReadOperation.validate = false;
        int choice = 0;

        do {

            System.out.print("Escolha a operação: ");

            try {
                choice = scan.nextInt();
                ReadOperation.validate = true;
            } catch (InputMismatchException e) {
                System.out.println("Erro. Insira apenas números inteiros.");
                scan.nextLine();
            }

        } while (!ReadOperation.validate);

        return choice;
    }
}
