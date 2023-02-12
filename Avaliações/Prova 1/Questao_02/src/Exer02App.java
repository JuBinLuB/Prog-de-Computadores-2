import components.Vetor;

public class Exer02App {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(3);

        // Verificando o conteúdo do vetor.
        System.out.println("Posições ocupadas: " + vetor.size());
        System.out.println("Posição 0: " + vetor.get(0));
        System.out.println("Posição 1: " + vetor.get(1));
        System.out.println("Posição 2: " + vetor.get(2));
        System.out.println("Tamanho do Vetor: " + vetor.getVetor().length);

        // Fazendo atribuições ao vetor.
        vetor.insert("The Lord of the Rings");
        vetor.insert("Percy Jackson and the Olympians");
        vetor.insert("Hunter x Hunter");
        vetor.insert("Re:Zero Kara Hajimeru Isekai Seikatsu");

        System.out.println();

        // Verificando o conteúdo do vetor após algumas atribuições.
        System.out.println("Posições ocupadas: " + vetor.size());
        System.out.println("Posição 0: " + vetor.get(0));
        System.out.println("Posição 1: " + vetor.get(1));
        System.out.println("Posição 2: " + vetor.get(2));
        System.out.println("Posição 3: " + vetor.get(3));
        System.out.println("Posição 4: " + vetor.get(4));
        System.out.println("Posição 5: " + vetor.get(5));
        System.out.println("Tamanho do Vetor: " + vetor.getVetor().length);

        System.out.println();

        // Fazendo novas atribuições ao vetor.
        vetor.insert("Steins;Gate");
        vetor.insert("Shigatsu wa Kimi no Uso");
        vetor.insert("Sora yori mo Tooi Basho");
        vetor.insert("K-ON!");

        // Verificando o conteúdo do vetor após novas atribuições.
        System.out.println("Posições ocupadas: " + vetor.size());
        System.out.println("Posição 0: " + vetor.get(0));
        System.out.println("Posição 1: " + vetor.get(1));
        System.out.println("Posição 2: " + vetor.get(2));
        System.out.println("Posição 3: " + vetor.get(3));
        System.out.println("Posição 4: " + vetor.get(4));
        System.out.println("Posição 5: " + vetor.get(5));
        System.out.println("Posição 6: " + vetor.get(6));
        System.out.println("Posição 7: " + vetor.get(7));
        System.out.println("Posição 8: " + vetor.get(8));
        System.out.println("Posição 9: " + vetor.get(9));
        System.out.println("Posição 10: " + vetor.get(10));
        System.out.println("Posição 11: " + vetor.get(11));
        System.out.println("Tamanho do Vetor: " + vetor.getVetor().length);
    }
}
