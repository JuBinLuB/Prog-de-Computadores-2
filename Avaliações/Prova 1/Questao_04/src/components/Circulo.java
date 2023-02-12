package components;

public class Circulo implements FormaGeometrica {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double comprimento() {
        return 2 * Math.PI * raio;
    }
}
