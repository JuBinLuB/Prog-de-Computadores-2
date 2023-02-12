package components;

public class Vetor {

    private String[] vetor;
    private int contador;

    public Vetor(int tamanho) {

        this.vetor = new String[tamanho];
        this.contador = 0;
    }

    public String[] getVetor() {
        return this.vetor;
    }

    public void insert(String string) {

        if (this.contador == this.vetor.length) {

            String[] novo = new String[this.vetor.length * 2];

            for (int i = 0; i < this.vetor.length; i++) {
                novo[i] = this.vetor[i];
            }
            this.vetor = novo;
        }

        this.vetor[this.contador] = string;
        this.contador++;
    }

    public String get(int posicao) {

        if (this.vetor[posicao] == null || posicao > this.vetor.length) {
            return null;
        }
        return this.vetor[posicao];
    }

    public int size() {
        return this.contador;
    }
}
