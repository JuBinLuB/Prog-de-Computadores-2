package components;

public class Ingresso {

    private double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public Ingresso() {
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String imprimeValor() {
        return "Valor do Ingresso: $" + getValor();
    }
}
