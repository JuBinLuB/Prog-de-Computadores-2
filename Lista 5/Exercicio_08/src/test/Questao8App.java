package test;

import java.util.InputMismatchException;

import components.Operations;

public class Questao8App {
    public static void main(String[] args) {

        boolean validar = false;

        do {

            try {
                Operations.leitura();
                validar = true;
            } catch (InputMismatchException e) {
                e.printStackTrace();
            }

        } while (!validar);
    }
}
