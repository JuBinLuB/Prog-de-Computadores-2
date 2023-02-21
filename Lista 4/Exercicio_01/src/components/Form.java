package components;

public class Form {

    private String conteudo;

    public Form(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return this.conteudo;
    }
}
