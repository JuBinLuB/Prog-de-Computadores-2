package test;

import java.util.HashMap;
import java.util.Map;

import components.Dados;
import components.Funcionario;

public class MapApp {
    public static void main(String[] args) {

        // D) Funcionário representado por uma instância da classe funcionário.
        Map<String, Funcionario> mapa = new HashMap<>();
        mapa.put("a1234", new Funcionario("Steve Jobs", "CEO", 5000));
        mapa.put("a1235", new Funcionario("Scott McNealy", "CEO", 5000));
        mapa.put("a1236", new Funcionario("Jeff Bezos", "CEO", 10000));
        mapa.put("a1237", new Funcionario("Larry Ellison", "CEO", 4000));
        mapa.put("a1238", new Funcionario("Bill Gates", "CEO", 8000));

        // B) Teste recuperando um funcionário pelo seu respectivo ID.
        System.out.println("Funcionário: " + mapa.get("a1234"));
        System.out.println();

        // B) Teste recuperando um funcionário cujo ID não está mapeado.
        System.out.println("ID não mapeado: " + mapa.get("a1000"));
        System.out.println();

        // C) Busca das chaves funcionam para String maíuscula e minúscula.
        Dados.buscarFuncionario(mapa, "A1238");
        Dados.buscarFuncionario(mapa, "A1236");
        System.out.println();

        // E) Percorrendo o mapa e exibindo os dados.
        Dados.exibirDados(mapa);
    }
}
