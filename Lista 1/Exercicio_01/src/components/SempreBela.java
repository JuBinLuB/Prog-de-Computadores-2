package components;

import java.util.Scanner;

public class SempreBela {

    private int pes;
    private int maos;
    private int podologia;

    private SempreBela[] manicures = new SempreBela[5];

    public void setPes(int pes) {
        this.pes = pes;
    }

    public int getPes() {
        return this.pes;
    }

    public void setMaos(int maos) {
        this.maos = maos;
    }

    public int getMaos() {
        return this.maos;
    }

    public void setPodologia(int podologia) {
        this.podologia = podologia;
    }

    public int getPodologia() {
        return this.podologia;
    }

    public void registro() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Registre o serviço das manicures...\n");
        for (int i = 0; i < manicures.length; i++) {

            this.manicures[i] = new SempreBela();

            System.out.println((i + 1) + "º Manicure...");
            System.out.print("Serviço de pés: ");
            this.manicures[i].setPes(scan.nextInt());
            System.out.print("Serviço de mãos: ");
            this.manicures[i].setMaos(scan.nextInt());
            System.out.print("Serviço de podologia: ");
            this.manicures[i].setPodologia(scan.nextInt());
            System.out.println();
        }

        scan.close();
    }

    public void pagamento() {

        double precoPes = 30.00;
        double precoMaos = 25.00;
        double precoPodologia = 45.00;
        double fatura = 0;

        for (int i = 0; i < manicures.length; i++) {

            fatura += precoPes * manicures[i].getPes();
            fatura += precoMaos * manicures[i].getMaos();
            fatura += precoPodologia * manicures[i].getPodologia();
            System.out.println((i + 1) + "º Manicure receberá: " + fatura * 0.5);
            fatura = 0;
        }
    }

}
