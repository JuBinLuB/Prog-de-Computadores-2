package components;

public class Cliente extends Pessoa {

    private double valorDivida;
    private int anoNascimento;

    public double getValorDivida() {
        return this.valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getAnoNascimento() {
        return this.anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    @Override
    public String toString() {
        System.out.println("Informações do Cliente...");
        return "Nome: " + getNome() +
                "\nIdade: " + getIdade() +
                "\nSexo: " + getSexo() +
                "\nValor da Dívida: $" + getValorDivida() +
                "\nAno de Nascimento: " + getAnoNascimento();
    }
}
