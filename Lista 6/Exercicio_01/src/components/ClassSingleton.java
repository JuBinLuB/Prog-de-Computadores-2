package components;

public class ClassSingleton {

    private static ClassSingleton instance = null;

    private ClassSingleton() {
    }

    public static ClassSingleton getInstance() {
        if (instance == null) {
            instance = new ClassSingleton();
        }
        return instance;
    }
}
