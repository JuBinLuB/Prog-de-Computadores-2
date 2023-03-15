package test;

import components.IncrementalSingleton;

public class TesteIncrementalSingleton {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            /*
             * Pela implementação da classe Incremental ser Singleton...
             * o Objeto é criado uma, e apenas uma, única vez.
             * logo, a variável estática count é incrementada e, seu valor...
             * atribuído à variável numero, somente no momento de criação do objeto.
             */
            IncrementalSingleton inc = IncrementalSingleton.getInstance();
            System.out.println(inc);
        }
    }
}
