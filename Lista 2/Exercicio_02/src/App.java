import components.JogoDaVelha;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        JogoDaVelha jogo = new JogoDaVelha();

        jogo.jogar(scan.nextInt(), scan.nextInt());
        scan.close();
    }
}
