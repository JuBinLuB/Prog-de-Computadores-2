import components.Number;

public class NumberApp {
    public static void main(String[] args) {

        // Criando três instâncias da Classe Number.
        Number n1 = new Number(5);
        Number n2 = new Number(5);
        Number n3 = new Number(10);

        // Comparando as Referências dos objetos.
        // Ou seja, o código abaixo está verificando se...
        // as variáveis de referências dos Objetos possuem o mesmo endereço de memória.
        System.out.println("Comparando as Referências...");
        System.out.println("n1 == n2: " + (n1 == n2));
        System.out.println("n1 == n3: " + (n1 == n3));
        System.out.println("n2 == n3: " + (n2 == n3));
        System.out.println();

        // Testando o método equals().
        // O código abaixo irá comparar o conteúdo dos objetos.
        // Ou seja, está verificando se possuem o mesmo valor armazenado.
        System.out.println("Comparando o conteúdo...");
        System.out.println("n1.equals(n2): " + n1.equals(n2));
        System.out.println("n1.equals(n3): " + n1.equals(n3));
        System.out.println("n2.equals(n3): " + n2.equals(n3));
        System.out.println();

        // Testando o método hashCode().
        // Ou seja, código abaixo está verificando se...
        // Objetos de mesmo conteúdo também possuem o mesmo valor de hashCode.
        // E, objetos de conteúdo diferentes possuem valores de hashCode diferentes.
        System.out.println("Hashcode...");
        System.out.println("hashCode de n1: " + n1.hashCode());
        System.out.println("hashCode de n2: " + n2.hashCode());
        System.out.println("hashCode de n3: " + n3.hashCode());
        System.out.println();

        // Testando o método toString().
        // Ou seja, o código abaixo efetuando uma chamada ao...
        // método toString sobrescrito na classe Number e...
        // retornando uma representação em String conteúdo dos objetos.
        System.out.println("Valores armazenados...");
        System.out.println("Valor armazenado em n1: " + n1);
        System.out.println("Valor armazenado em n2: " + n2);
        System.out.println("Valor armazenado em n3: " + n3);
    }
}
