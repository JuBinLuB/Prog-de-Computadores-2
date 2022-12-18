package components;

public class Loja {

    private int[][] vendas = new int[12][4];

    public int[][] getVendas() {
        return this.vendas;
    }

    public void vendasMes(int[][] mes) {

        int mesV = 0;

        System.out.println("Total vendido em cada mês do ano...");
        for (int i = 0; i < mes.length; i++) {
            for (int j = 0; j < mes[i].length; j++) {
                mesV += mes[i][j];
            }

            System.out.printf("%2dº Mês: %2d\n", (i + 1), mesV);
            mesV = 0;
        }

        System.out.println();
    }

    public void vendasSemana(int[][] semana) {

        int cont = 0;

        System.out.println("Total vendido em cada semana durante todo o ano...");
        for (int i = 0; i < semana.length; i++) {
            for (int j = 0; j < semana[i].length; j++) {
                System.out.printf("%2dº semana: %2d\n", (1 + cont++), semana[i][j]);
            }
        }

        System.out.println();
    }

    public void vendasAno(int[][] ano) {

        int anoV = 0;

        for (int i = 0; i < ano.length; i++) {
            for (int j = 0; j < ano[i].length; j++) {
                anoV += ano[i][j];
            }
        }

        System.out.println("Total de vendas do ano foram de: " + anoV);
        System.out.println();
    }

}
