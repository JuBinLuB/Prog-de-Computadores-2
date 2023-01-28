package components;

public class Empregado extends Pessoa {

    private double salario;
    private String matricula;

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double valorInss() {
        return getSalario() * 0.11;
    }
}
