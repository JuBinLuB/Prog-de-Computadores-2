public class TesteException {
    public static void main(String[] args) {

        System.out.println("Início do main.");
        metodo1();
        System.out.println("Fim do main.");
    }

    static void metodo1() {

        System.out.println("Início do método1.");
        metodo2();
        System.out.println("Fim do método1.");
    }

    static void metodo2() {

        System.out.println("Início do método2.");

        int[] array = new int[10];

        try {
            for (int i = 0; i <= 15; i++) {
                array[i] = i;
                System.out.println(i);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Limite do array atingido.");
        }

        System.out.println("Fim do método2.");
    }
}
