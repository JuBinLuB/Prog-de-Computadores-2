package components.b;

import java.util.Scanner;
import java.util.Set;

public class MenuB {

    private static boolean aberto;
    private static int digito;

    public static void painel(Set<Produto> produtos, Scanner scan) {

        MenuB.aberto = true;

        do {

            System.out.println("--------- MENU ---------");
            System.out.println("[1] - Adicionar Produto");
            System.out.println("[2] - Exibir Produtos");
            System.out.println("[3] - Encerrar");
            System.out.println();

            do {

                System.out.print("Escolha uma opção para navegar pelo Menu: ");
                MenuB.digito = scan.nextInt();

                System.out.println();
            } while (MenuB.digito < 1 && MenuB.digito > 3);

            switch (MenuB.digito) {

                case 1:

                    System.out.println("--------- Adicionar Produto ---------");
                    Registro.RegistrarProduto(produtos, scan);
                    break;
                case 2:

                    System.out.println("--------- Exibir Produtos ---------");

                    int i = 1;
                    for (Produto produto : produtos) {
                        System.out.println();
                        System.out.println(i + "º Produto..." + produto);
                        i++;
                    }
                    break;
                case 3:

                    System.out.println("--------- Menu encerrado ---------");
                    MenuB.aberto = false;
                    break;
                default:
                    System.out.println("Digito inválido.");
                    break;
            }

            System.out.println();
        } while (MenuB.aberto);
    }
}
