package components;

public class Voo {

    private boolean[] cadeiras;
    private int numeroVoo;
    private String dataVoo;

    public Voo(int numeroVoo, String dataVoo) {

        this.cadeiras = new boolean[5];
        this.numeroVoo = numeroVoo;
        this.dataVoo = dataVoo;
    }

    public String getDataVoo() {
        return this.dataVoo;
    }

    public int proximoLivre() {

        for (int i = 0; i < this.cadeiras.length; i++) {

            if (!this.cadeiras[i]) {
                return i + 1;
            }
        }
        return vagas();
    }

    public boolean verifica(int numero) {
        return !this.cadeiras[numero];
    }

    public boolean ocupa(int numero) {

        if (verifica(numero)) {

            this.cadeiras[numero] = true;
            System.out.println("Operação foi bem sucedida!");
            return true;
        }
        System.out.println("Assento já ocupado!");
        return false;
    }

    public int vagas() {

        int contador = 0;
        for (int i = 0; i < this.cadeiras.length; i++) {

            if (!this.cadeiras[i]) {
                contador++;
            }
        }
        return contador;
    }

    public int getVoo() {
        return this.numeroVoo;
    }

    @Override
    public Voo clone() {

        try {
            Voo clone = (Voo) super.clone();
            clone.cadeiras = this.cadeiras.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Clonagem não suportada");
        }
    }
}
