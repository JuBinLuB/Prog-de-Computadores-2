import components.JogoDaVelha;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        JogoDaVelha jogo = new JogoDaVelha();

        System.out.println("Faça sua jogada. Escolha Linha e Coluna, por valores de 1 a 3.");

        jogo.jogar(scan.nextInt(), scan.nextInt());
        scan.close();
    }
}
