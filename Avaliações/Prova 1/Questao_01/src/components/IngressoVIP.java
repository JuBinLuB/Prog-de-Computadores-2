package components;

public class IngressoVIP extends Ingresso {

    private double valorAdicional;

    public IngressoVIP(double valor) {
        super(valor);
    }

    public double getValorAdicional() {
        return this.valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @Override
    public String imprimeValor() {
        System.out.println(super.imprimeValor());
        return "Valor do Ingresso VIP: $" + (getValor() + getValorAdicional());
    }
}
