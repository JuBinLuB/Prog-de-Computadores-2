package components;

public class InvalidOperationException extends Exception {

    public InvalidOperationException() {
        super("Operação inválida.");
    }

    public InvalidOperationException(String mensagem) {
        super(mensagem);
    }
}
