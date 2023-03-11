package components;

// Letra E
// i) Fazendo com que a classe InvalidOperationException herde de RuntimeException;
// ii) E removendo o tratamento de erro do aplicativo;
// iii) Ao surgir operações inválidas o programa será imediatamente encerrado pela JVM.

public class InvalidOperationException extends Exception {

    public InvalidOperationException() {
        super("Operação inválida.");
    }

    public InvalidOperationException(String mensagem) {
        super(mensagem);
    }
}
