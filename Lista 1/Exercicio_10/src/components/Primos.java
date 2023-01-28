package components;

public class Primos {

    private int numero;
    private int contador;
    private int[] auxiliar;
    private int[] fatoresPrimos;

    public Primos() {
        this.contador = 0;
        this.numero = Leitura.lerTeclado();
        this.auxiliar = new int[getNumero()];
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getContador() {
        return this.contador;
    }

    // Conta e decompõe o número dado em fatores primos.
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

    // Armazena os fatores primos do número dado em um Vetor de tamanho exato.
    public void armazenarFatoresPrimos() {

        this.fatoresPrimos = new int[getContador()];

        for (int i = 0; i < fatoresPrimos.length; i++) {
            this.fatoresPrimos[i] = this.auxiliar[i];
        }
    }

    // Realiza a impressão dos fatores primos no console.
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
