import components.Primos;

public class Exercicio_10 {
    public static void main(String[] args) {

        Primos primos = new Primos();

        primos.contarFatoresPrimos(primos.getNumero());
        primos.armazenarFatoresPrimos();
        primos.imprimirFatoresPrimos();
    }
}
