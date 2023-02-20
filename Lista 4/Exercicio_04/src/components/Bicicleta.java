package components;

public class Bicicleta extends Veiculo {

    @Override
    public void listarVerificacoes() {
        System.out.print("Verificações: ");
        System.out.println("Os cabos e os amortecedores estão com problemas.");
    }

    @Override
    public void ajustar() {
        System.out.print("Ajustes: ");
        System.out.println("Banco e guidão ajustados.");
    }

    @Override
    public void limpar() {
        System.out.print("Limpeza: ");
        System.out.println("Quadro e guidão foram limpos.");
    }

    @Override
    public String toString() {
        return "Efetuando a manutenção da Bicicleta...";
    }
}
