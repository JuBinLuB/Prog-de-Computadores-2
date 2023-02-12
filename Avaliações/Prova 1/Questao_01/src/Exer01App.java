import java.util.Scanner;
import components.Ingresso;
import components.IngressoVIP;

public class Exer01App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Cadastrando o valor do ingresso.
        System.out.print("Cadastre o valor do Ingresso: ");
        double valor = scan.nextDouble();

        // Declarando as instâncias dos Objetos.
        Ingresso ingressos = new Ingresso();
        IngressoVIP ingressosVIP = new IngressoVIP(valor);

        // Cadastrando o valor do IngressoVIP.
        System.out.print("Cadastre o valor adicional do IngressoVIP: ");
        ingressosVIP.setValorAdicional(scan.nextDouble());

        System.out.println();
        System.out.println(ingressosVIP.imprimeValor());
        System.out.println("Diferença de preço entre Ingresso e IngressoVIP: $" +
                (ingressosVIP.getValorAdicional() - ingressos.getValor()));

        scan.close();
    }
}
