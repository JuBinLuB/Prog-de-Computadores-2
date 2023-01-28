package components;

public class Cachorro extends Animal {

    private String raca;

    public Cachorro(String nome, double peso, String raca) {
        super(nome);
        super.setPeso(peso);
        this.raca = raca;
    }

    public String getRaca() {
        return this.raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        System.out.println("Informações do cachorro...");
        return "Nome: " + getNome() + "\nPeso: " + getPeso() + "kg" + "\nRaça: " + getRaca();
    }
}
