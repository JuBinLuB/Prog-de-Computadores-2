import components.Voo;

public class Exer03App {
    public static void main(String[] args) {

        Voo voo = new Voo(12, "04/02/2023");

        // Número do voô.
        System.out.println("Número do voô: " + voo.getVoo());
        System.out.println();

        // Verificando o número de cadeiras vagas disponíveis.
        System.out.println("Número de cadeiras vagas: " + voo.vagas());
        System.out.println();

        // Ocupando determinada cadeiras do voô.
        System.out.println("Ocupando assentos:");
        voo.ocupa(0);
        voo.ocupa(1);
        voo.ocupa(2);
        voo.ocupa(3);
        // voo.ocupa(4);

        System.out.println();

        // Verificando o número de cadeiras vagas disponíveis.
        System.out.println("Número de cadeiras vagas: " + voo.vagas());
        System.out.println();

        // Verificando a próxima cadeira vaga disponível.
        System.out.println("Próxima cadeira vaga disponível: " + voo.proximoLivre());
    }
}
