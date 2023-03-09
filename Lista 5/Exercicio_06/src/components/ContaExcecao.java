package components;

public class ContaExcecao extends Exception {

    public ContaExcecao() {
        super("Saldo Insuficiente.");
    }

    public ContaExcecao(String mensagem) {
        super(mensagem);
    }
}
