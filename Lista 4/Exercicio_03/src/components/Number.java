package components;

public class Number {

    private int value;

    public Number(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
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

        Number number = (Number) obj;
        return this.getValue() == number.getValue();
    }

    @Override
    public int hashCode() {
        int code = 10;
        code *= 5 + this.getValue();
        return code;
    }

    @Override
    public String toString() {
        return Integer.toString(this.getValue());
    }
}
