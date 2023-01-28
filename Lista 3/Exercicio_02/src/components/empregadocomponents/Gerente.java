package components.empregadocomponents;

import components.Empregado;

public class Gerente extends Empregado {

    private String nomeGerencia;

    public String getNomeGerencia() {
        return this.nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }

    @Override
    public String toString() {
        System.out.println("Informações do Gerente...");
        return "Nome: " + getNome() +
                "\nIdade: " + getIdade() +
                "\nMatrícula: " + getMatricula() +
                "\nNome da Gerencia: " + getNomeGerencia() +
                "\nValor do INSS: $" + valorInss();
    }
}
