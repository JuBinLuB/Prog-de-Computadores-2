package components;

import java.util.Scanner;

public class LerTeclado {

    private static int verticeX;
    private static int verticeY;
    private static int verticeZ;

    public static int getVerticeX() {
        return verticeX;
    }

    public static void setVerticeX(int verticeX) {
        LerTeclado.verticeX = verticeX;
    }

    public static int getVerticeY() {
        return verticeY;
    }

    public static void setVerticeY(int verticeY) {
        LerTeclado.verticeY = verticeY;
    }

    public static int getVerticeZ() {
        return verticeZ;
    }

    public static void setVerticeZ(int verticeZ) {
        LerTeclado.verticeZ = verticeZ;
    }

    public static void leitura() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira valores inteiros de 1 a 5...");
        do {

            System.out.print("1º Vértice: ");
            setVerticeX(scan.nextInt());

            do {

                System.out.print("2º Vértice: ");
                setVerticeY(scan.nextInt());

            } while (getVerticeY() == getVerticeX());

            System.out.print("3º Vértice: ");
            setVerticeZ(scan.nextInt());

        } while (getVerticeX() < 1 || getVerticeX() > 5 ||
                getVerticeY() < 1 || getVerticeY() > 5 ||
                getVerticeZ() < 1 || getVerticeZ() > 5);

        System.out.println();
        scan.close();
    }
}
