package components;

public class ContaException extends Exception {

    // 1. Criando um atributo saldoRecuperado na classe ContaException.
    private double saldoRecuperado;

    // 2. Gerando o Getter de saldoRecuperado.
    public double getSaldoRecuperado() {
        return saldoRecuperado;
    }

    // 3. Modificando o construtor de ContaException para receber o saldo atual.
    public ContaException(double saldo) {
        super("Saldo insuficiente.");
        this.saldoRecuperado = saldo;
    }

    public ContaException(String message, double saldo) {
        super(message);
        this.saldoRecuperado = saldo;
    }
}
