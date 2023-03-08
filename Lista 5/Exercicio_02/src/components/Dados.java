package components;

import java.util.Map;

public class Dados {

    public static void buscarFuncionario(Map<String, Funcionario> mapa, String chave) {

        for (Map.Entry<String, Funcionario> entry : mapa.entrySet()) {

            if (entry.getKey().equalsIgnoreCase(chave)) {
                System.out.println("Funcionário de ID " + chave + " é " + entry.getValue().getNome() + ".");
            }
        }
    }

    public static void exibirDados(Map<String, Funcionario> mapa) {

        System.out.println("--------- Funcionários ---------");

        for (Map.Entry<String, Funcionario> entry : mapa.entrySet()) {

            System.out.println("ID: " + entry.getKey() + " " + entry.getValue());
            System.out.println();
        }
    }
}
