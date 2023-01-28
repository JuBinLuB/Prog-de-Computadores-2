package components.empregadocomponents;

import components.Empregado;

public class Vendedor extends Empregado {

    private double valorVendas;
    private int qntVendas;

    public double getValorVendas() {
        return this.valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public int getQntVendas() {
        return this.qntVendas;
    }

    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }

    @Override
    public String toString() {
        System.out.println("Informações do Vendedor...");
        return "Nome: " + getNome() +
                "\nSalário: $" + getSalario() +
                "\nValor das Vendas: $" + getValorVendas() +
                "\nQuantidade de Vendas: " + getQntVendas();
    }
}
