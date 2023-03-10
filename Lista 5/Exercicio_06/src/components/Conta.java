package components;

public class Conta {

    private Long id;
    private String titular;
    private double saldo;
    private double limite;

    public Conta(Long id, String titular) {
        this.id = id;
        this.titular = titular;
        this.saldo = 0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) throws Exception {

        if ((this.getSaldo() + this.getLimite()) < valor) {
            throw new ContaExcecao();
        }
        this.saldo -= valor;
    }
}
