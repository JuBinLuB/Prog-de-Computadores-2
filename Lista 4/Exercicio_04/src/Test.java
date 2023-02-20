import components.Oficina;
import components.Veiculo;

public class Test {
    public static void main(String[] args) {

        Oficina oficina = new Oficina();
        Veiculo veiculo;

        for (int i = 0; i < 4; i++) {
            veiculo = oficina.proximo();
            oficina.manutencao(veiculo);
            System.out.println();
        }
    }
}
