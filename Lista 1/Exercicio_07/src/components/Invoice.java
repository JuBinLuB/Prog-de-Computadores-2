package components;

public class Invoice {

    private int numeroItem;
    private int quantidadeComprada;
    private String descricaoItem;
    private double precoItem;

    public Invoice(int numero, int quantidade, String descricao, double preco) {

        this.numeroItem = numero;
        this.quantidadeComprada = quantidade;
        this.descricaoItem = descricao;
        this.precoItem = preco;

        if (getQuantidadeComprada() < 0) {
            this.quantidadeComprada = 0;
        }
        if (getPrecoItem() < 0) {
            this.precoItem = 0.0;
        }
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public int getNumeroItem() {
        return this.numeroItem;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public int getQuantidadeComprada() {
        return this.quantidadeComprada;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public String getDescricaoItem() {
        return this.descricaoItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }

    public double getPrecoItem() {
        return this.precoItem;
    }

    public double getInvoiceAmount() {
        return this.quantidadeComprada * this.precoItem;
    }

}
