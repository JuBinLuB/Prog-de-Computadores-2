package components;

public abstract class CartaoWeb {

    private String destinatario;

    public CartaoWeb(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDestinatario() {
        return this.destinatario;
    }

    public abstract void showMessage();
}
