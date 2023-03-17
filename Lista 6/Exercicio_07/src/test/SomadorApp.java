package test;

import components.AdapterSomador;
import components.Cliente;
import components.SomadorEsperado;
import components.SomadorExistente;

public class SomadorApp {
    public static void main(String[] args) {

        SomadorExistente somadorEsperado = new SomadorExistente();
        SomadorEsperado somadorExistente = new AdapterSomador(somadorEsperado);

        Cliente cliente = new Cliente(somadorExistente);
        cliente.executar();
    }
}
