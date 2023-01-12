package components;

import java.util.Scanner;

public class Primos {

    private int numero;
    private int contador;
    private int[] auxiliar;
    private int[] fatoresPrimos;

    public int getNumero() {
        return this.numero;
    }

    public int getContador() {
        return this.contador;
    }

    public Primos() {
        this.contador = 0;
    }

    public void leitura() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Insira um número: ");
        this.numero = scan.nextInt();

        this.auxiliar = new int[getNumero()];

        scan.close();
    }

    public int contarFatoresPrimos(int numero) {

        for (int i = 2; i <= numero; i++) {

            if (numero % i == 0) {

                this.auxiliar[getContador()] = i;
                this.contador++;
                return contarFatoresPrimos(numero / i);
            }
        }

        return 0;
    }

    public void armazenarFatoresPrimos() {

        this.fatoresPrimos = new int[getContador()];

        for (int i = 0; i < fatoresPrimos.length; i++) {
            this.fatoresPrimos[i] = this.auxiliar[i];
        }
    }

    public void imprimirFatoresPrimos() {

        int decompor = getNumero();

        System.out.println("\nFatores primos do número " + getNumero() + ":\n");
        for (int i = 0; i < fatoresPrimos.length; i++) {

            System.out.printf("%3d | %3d\n", decompor, this.fatoresPrimos[i]);
            decompor /= this.fatoresPrimos[i];
        }

        System.out.printf("%3d |\n", decompor);
        System.out.println();
    }
}
