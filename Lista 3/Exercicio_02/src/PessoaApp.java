import components.Cliente;
import components.empregadocomponents.Gerente;
import components.empregadocomponents.Vendedor;

public class PessoaApp {
    public static void main(String[] args) {

        // Inserindo as informações do cliente.
        Cliente cliente = new Cliente();
        cliente.setNome("Alan Turing");
        cliente.setIdade(38);
        cliente.setSexo("Masculino");
        cliente.setValorDivida(125.5);
        cliente.setAnoNascimento(1912);

        // Inserindo as informações do gerente.
        Gerente gerente = new Gerente();
        gerente.setNome("Steve Jobs");
        gerente.setIdade(55);
        gerente.setMatricula("11.1.1111");
        gerente.setNomeGerencia("R");
        gerente.setSalario(4500.5);

        // Inserindo as informações do vendedor.
        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Bill Gates");
        vendedor.setSalario(1433.44);
        vendedor.setValorVendas(540.2);
        vendedor.setQntVendas(230);

        // Imprimindo todas as informações.
        System.out.println(cliente);
        System.out.println();
        System.out.println(gerente);
        System.out.println();
        System.err.println(vendedor);
    }
}
