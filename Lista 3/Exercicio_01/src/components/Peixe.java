package components;

public class Peixe extends Animal {

    private String tipoHabitat;

    public Peixe(String nome) {
        super(nome);
    }

    public String getTipoHabitat() {
        return this.tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }

    @Override
    public String toString() {
        System.out.println("Informações do Peixe...");
        return "Nome: " + getNome() + "\nPeso: " + getPeso() + "g" + "\nHabitat: " + getTipoHabitat();
    }
}
