package components;

import java.util.Random;

public class Oficina {

    private static final Random rand = new Random();

    public Veiculo proximo() {

        if (rand.nextBoolean()) {
            return new Bicicleta();
        } else {
            return new Automovel();
        }
    }

    public void manutencao(Veiculo v) {

        System.out.println(v);

        v.listarVerificacoes();
        v.ajustar();
        v.limpar();

        if (v instanceof Automovel) {
            ((Automovel) v).mudarOleo();
        }
    }
}
