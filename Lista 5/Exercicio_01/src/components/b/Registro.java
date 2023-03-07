package components.b;

import java.util.Scanner;
import java.util.Set;

public class Registro {

    private static boolean lendo;
    private static boolean validar;
    private static Long idProduto;
    private static String nomeProduto;
    private static double precoProduto;

    public static void RegistrarProduto(Set<Produto> produtos, Scanner scan) {

        System.out.println("Informe os dados do produto.");
        System.out.println("Digite ID \"-1\" para sair.");

        Registro.lendo = true;
        int i = 1;

        do {

            System.out.println();
            System.out.println(i + "º Produto...");

            Registro.validar = false;
            do {

                scan.nextLine();

                try {
                    System.out.print("ID: ");
                    Registro.idProduto = scan.nextLong();
                    Registro.validar = true;
                } catch (Exception e) {
                    System.out.println("ID inválido: " + e.getMessage());
                }

            } while (!Registro.validar);

            if (Registro.idProduto.equals(-1L)) {
                break;
            }

            scan.nextLine();

            System.out.print("Nome: ");
            Registro.nomeProduto = scan.nextLine();

            System.out.print("Preço: ");
            Registro.precoProduto = scan.nextDouble();

            Produto produto = new Produto(idProduto, nomeProduto, precoProduto);

            if (produtos.contains(produto)) {

                System.out.println();
                System.out.println("ID número \"" + Registro.idProduto + "\" já está cadastrado. Tente novamente.");
            } else {
                produtos.add(produto);
                i++;
            }

        } while (Registro.lendo);
    }
}
