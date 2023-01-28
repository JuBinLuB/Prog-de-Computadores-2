import java.util.Scanner;
import components.Peixe;
import components.Cachorro;

public class AnimalApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nome;

        // Inserindo as informações do Peixe.
        System.out.print("Informe o nome do Peixe: ");
        nome = scan.next();
        Peixe peixe = new Peixe(nome, 2.5, "Água doce");

        // Inserindo as informações do Cachorro.
        System.out.print("Informe o nome do Cachorro: ");
        nome = scan.next();
        Cachorro cachorro = new Cachorro(nome, 29.8, "Rottweiler");

        System.out.println();
        System.out.println(peixe.toString());
        System.out.println();
        System.out.println(cachorro.toString());

        scan.close();
    }
}
