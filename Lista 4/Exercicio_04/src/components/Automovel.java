package components;

public class Automovel extends Veiculo {

    @Override
    public void listarVerificacoes() {
        System.out.print("Verificações: ");
        System.out.println("Desgaste dos pneus e nível do oléo abaixo do indicado.");
    }

    @Override
    public void ajustar() {
        System.out.print("Ajustes: ");
        System.out.println("Retrovisores ajustados.");
    }

    @Override
    public void limpar() {
        System.out.print("Limpeza: ");
        System.out.println("Pneus e parabrisa limpos.");
    }

    public void mudarOleo() {
        System.out.println("Oléo do motor trocado.");
    }

    @Override
    public String toString() {
        return "Efetuando a manutenção do Automóvel...";
    }
}
