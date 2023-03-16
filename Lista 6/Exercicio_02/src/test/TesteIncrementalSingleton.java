package test;

import components.IncrementalSingleton;

public class TesteIncrementalSingleton {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            /*
             * Pela implementação da classe Incremental ser Singleton...
             * o objeto é criado uma, e somente uma, única vez.
             * Logo, a variável estática count é incrementada e, seu valor,...
             * atribuído à variável número somente no momento de criação do objeto.
             */
            IncrementalSingleton inc = IncrementalSingleton.getInstance();
            System.out.println(inc);
        }
    }
}
