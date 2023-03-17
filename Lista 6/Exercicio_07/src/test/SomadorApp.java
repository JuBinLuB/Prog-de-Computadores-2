package test;

import components.AdapterSomador;
import components.Cliente;
import components.SomadorEsperado;
import components.SomadorExistente;

public class SomadorApp {
    public static void main(String[] args) {

        SomadorExistente somadorExistente = new SomadorExistente();
        SomadorEsperado somadorEsperado = new AdapterSomador(somadorExistente);

        Cliente cliente = new Cliente(somadorEsperado);
        cliente.executar();
    }
}
