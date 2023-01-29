import java.util.Scanner;
import components.Peixe;
import components.Cachorro;

public class AnimalApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Inserindo as informações do Peixe.
        System.out.print("Informe o nome do Peixe: ");

        Peixe peixe = new Peixe(scan.nextLine());

        System.out.print("Informe o peso do Peixe: ");
        peixe.setPeso(scan.nextDouble());
        scan.nextLine();
        System.out.print("Informe o Habitat do Peixe: ");
        peixe.setTipoHabitat(scan.nextLine());

        System.out.println();

        // Inserindo as informações do Cachorro.
        System.out.print("Informe o nome do Cachorro: ");

        Cachorro cachorro = new Cachorro(scan.nextLine());

        System.out.print("Informe o peso do Cachorro: ");
        cachorro.setPeso(scan.nextDouble());
        scan.nextLine();
        System.out.print("Informe a raça do Cachorro: ");
        cachorro.setRaca(scan.nextLine());

        System.out.println();

        // Imprimindo as informações.
        System.out.println(peixe.toString());
        System.out.println();
        System.out.println(cachorro.toString());

        scan.close();
    }
}
