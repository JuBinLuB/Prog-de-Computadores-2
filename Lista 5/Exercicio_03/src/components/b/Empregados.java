package components.b;

import java.time.LocalDate;
import java.util.Objects;

public class Empregados implements Comparable<Empregados> {

    private Long id;
    private String nome;
    private double salario;
    private LocalDate data;

    public Empregados(Long id, String nome, double salario, LocalDate data) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Empregados empregado = (Empregados) obj;
        return this.getId().equals(empregado.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "\nID: " + this.getId() +
                "\nNome: " + this.getNome() +
                "\nSalário: " + this.getSalario() +
                "\nData de contratação: " + this.getData();
    }

    @Override
    public int compareTo(Empregados o) {
        // Retorna -1, se this < o.
        // Retorna 0, se this == o.
        // Retorna 1, se this > o.
        if (this.getSalario() < o.getSalario()) {
            return -1;
        }
        if (this.getSalario() > o.getSalario()) {
            return 1;
        }
        return 0;
    }
}
