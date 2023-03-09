import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean validar = false;

        do {

            try {

                System.out.println("Eu sei dividir!");
                System.out.print("Informe o primeiro valor: ");
                int x = scan.nextInt();
                System.out.print("Informe o segundo valor: ");
                int y = scan.nextInt();

                double r = (x / y);
                System.out.println("\nO resultado da divisão é " + r);

                validar = true;
            } catch (InputMismatchException e) {
                System.out.println("Operação inválida! Insira somente números inteiros.");
                scan.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("Não é possível dividir por zero. Tente novamente.");
            }

            System.out.println();
        } while (!validar);

        scan.close();
    }
}
