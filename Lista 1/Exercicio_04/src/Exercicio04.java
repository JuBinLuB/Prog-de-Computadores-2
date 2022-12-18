import components.Loja;
import java.util.Random;

public class Exercicio04 {
    public static void main(String[] args) {

        Loja loja = new Loja();

        Random rand = new Random();

        for (int i = 0; i < loja.getVendas().length; i++) {
            for (int j = 0; j < loja.getVendas()[i].length; j++) {

                loja.getVendas()[i][j] = rand.nextInt(100);
            }
        }

        loja.vendasMes(loja.getVendas());
        loja.vendasSemana(loja.getVendas());
        loja.vendasAno(loja.getVendas());
    }

}
