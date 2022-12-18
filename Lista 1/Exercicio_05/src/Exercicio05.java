import java.util.Random;

public class Exercicio05 {
    public static void main(String[] args) {

        int m[][] = new int[3][3];

        Random rand = new Random();

        System.out.println("Matriz 3x3");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = rand.nextInt(20);
                System.out.printf("%2d ", m[i][j]);
            }

            System.out.println();
        }

        System.out.println("\nMatriz girada em 90º");
        for (int i = 0; i < m.length; i++) {
            for (int j = m[i].length - 1; j >= 0; j--) {
                System.out.printf("%2d ", m[j][i]);
            }

            System.out.println();
        }

    }
}
