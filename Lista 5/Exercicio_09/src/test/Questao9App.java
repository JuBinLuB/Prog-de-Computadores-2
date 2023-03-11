import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import components.ExceptionRethrow;

public class Questao9App {
    public static void main(String[] args) {

        List<String> fellowship = new ArrayList<>();
        fellowship.add("Frodo");
        fellowship.add("Gandalf");
        fellowship.add("Aragorn");
        fellowship.add("Legolas");
        fellowship.add("Gimli");
        fellowship.add("Boromir");
        fellowship.add("Sam");
        fellowship.add("Merry");
        fellowship.add("Pippin");

        try {
            ExceptionRethrow.someMethod(fellowship);
        } catch (InputMismatchException | IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
