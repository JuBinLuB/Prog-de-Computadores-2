package components.a;

import java.util.Scanner;
import java.util.Set;

public class Menu {

    private static boolean aberto;
    private static int digito;
    private static String nomeInformado;

    public static void painel(Set<String> nomes, Scanner scan) {

        Menu.aberto = true;

        do {

            System.out.println("--------- MENU ---------");
            System.out.println("[1] - Adicionar Nome");
            System.out.println("[2] - Remover Nome");
            System.out.println("[3] - Verificar Nome");
            System.out.println("[4] - Apagar Todos");
            System.out.println("[5] - Encerrar");
            System.out.println();

            do {

                System.out.print("Escolha uma opção para navegar pelo Menu: ");
                Menu.digito = scan.nextInt();

                scan.nextLine();
                System.out.println();
            } while (Menu.digito < 1 && Menu.digito > 4);

            switch (Menu.digito) {

                case 1:

                    System.out.println("--------- Adicionar Nome ---------");
                    System.out.println("Digite uma série de nomes...");
                    Leitura.leitura(nomes, scan);
                    break;
                case 2:

                    System.out.println("--------- Remover Nome ---------");
                    System.out.print("Digite o nome que deseja remover: ");
                    Menu.nomeInformado = scan.nextLine();

                    if (nomes.remove(Menu.nomeInformado)) {
                        System.out.println(Menu.nomeInformado + " removido(a) com sucesso!");
                    } else {
                        System.out.println("Erro. Nome informado não pertence ao conjunto.");
                    }
                    break;
                case 3:

                    System.out.println("--------- Verificar Nome ---------");
                    System.out.print("Digite o nome que deseja verificar: ");
                    Menu.nomeInformado = scan.nextLine();

                    if ((nomes.contains(Menu.nomeInformado))) {
                        System.out.println(Menu.nomeInformado + " está contido(a) no conjunto.");
                    } else {
                        System.out.println(Menu.nomeInformado + " não está contido(a) no conjunto.");
                    }
                    break;
                case 4:

                    System.out.println("--------- Conjunto apagado ---------");
                    nomes.clear();
                    break;
                case 5:

                    System.out.println("--------- Menu encerrado ---------");
                    Menu.aberto = false;
                    break;
                default:
                    System.out.println("Digito inválido.");
                    break;
            }

            System.out.println();
        } while (Menu.aberto);
    }
}
