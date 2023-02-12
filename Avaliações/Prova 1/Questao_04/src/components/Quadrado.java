package components;

public class Quadrado implements FormaGeometrica {

    private double lado;

    public Quadrado(double medida) {
        this.lado = medida;
    }

    @Override
    public double area() {
        return Math.pow(this.lado, 2);
    }

    @Override
    public double comprimento() {
        return 4 * this.lado;
    }
}
