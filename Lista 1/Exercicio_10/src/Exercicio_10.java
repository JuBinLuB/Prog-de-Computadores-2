import components.Leitura;
import components.Primos;

public class Exercicio_10 {
    public static void main(String[] args) {

        int numero = Leitura.lerTeclado();

        Primos primos = new Primos(numero);

        primos.contarFatoresPrimos(numero);
        primos.armazenarFatoresPrimos();
        primos.imprimirFatoresPrimos(numero);
    }
}
