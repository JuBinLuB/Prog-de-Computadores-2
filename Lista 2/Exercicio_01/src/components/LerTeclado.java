package components;

import java.util.Scanner;

public class LerTeclado {

    private static int VerticeX;
    private static int VerticeY;
    private static int VerticeZ;

    public static int getVerticeX() {
        return VerticeX;
    }

    public static void setVerticeX(int verticeX) {
        LerTeclado.VerticeX = verticeX;
    }

    public static int getVerticeY() {
        return VerticeY;
    }

    public static void setVerticeY(int verticeY) {
        LerTeclado.VerticeY = verticeY;
    }

    public static int getVerticeZ() {
        return VerticeZ;
    }

    public static void setVerticeZ(int verticeZ) {
        LerTeclado.VerticeZ = verticeZ;
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
