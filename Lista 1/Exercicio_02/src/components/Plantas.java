package components;

import java.util.Scanner;

public class Plantas {

    private String nome;
    private int estoqueIdeal;
    private int estoque;

    private Plantas[] plantas;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setEstoqueIdeal(int estoqueIdeal) {
        this.estoqueIdeal = estoqueIdeal;
    }

    public int getEstoqueIdeal() {
        return this.estoqueIdeal;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getEstoque() {
        return this.estoque;
    }

    public void cadastro() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a quantidade de Plantas que deseja cadastrar: ");
        this.plantas = new Plantas[scan.nextInt()];

        System.out.println("\nCadastre abaixo os tipos de Plantas:\n");
        for (int i = 0; i < plantas.length; i++) {

            this.plantas[i] = new Plantas();

            System.out.println((i + 1) + "º planta...");
            System.out.print("Nome: ");
            this.plantas[i].setNome(scan.next());
            System.out.print("Estoque Ideal: ");
            this.plantas[i].setEstoqueIdeal(scan.nextInt());
            System.out.print("Quantidade em Estoque: ");
            this.plantas[i].setEstoque(scan.nextInt());
            System.out.println();
        }

        scan.close();
    }

    public void reposicao() {

        int rep = 0;

        System.out.println("Quantidade de plantas a serem compradas...");
        for (int i = 0; i < plantas.length; i++) {

            rep = this.plantas[i].getEstoqueIdeal() - this.plantas[i].getEstoque();
            if (rep > 0) {
                System.out.println(this.plantas[i].getNome() + ": " + rep);
            }

        }

    }
}
