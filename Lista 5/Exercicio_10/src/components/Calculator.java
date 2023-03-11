package components;

public class Calculator {

    public static double div(double p, double q) throws InvalidOperationException {

        if (q == 0) {
            throw new InvalidOperationException();
        }
        return p / q;
    }

    public static double log10(double l) throws InvalidOperationException {

        if (l < 1) {
            throw new InvalidOperationException();
        }
        return Math.log10(l);
    }
}
