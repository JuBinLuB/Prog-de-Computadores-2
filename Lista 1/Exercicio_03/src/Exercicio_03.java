import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Insira um inteiro: ");
        int n = scan.nextInt();

        System.out.println("\nF(" + n + ") = " + F(n));

        scan.close();
    }

    public static int F(int n) {

        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        return (2 * F(n - 1) + 3 * F(n - 2));
    }

}
