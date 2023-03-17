package test;

import components.AdapterSomador;
import components.Cliente;
import components.SomadorEsperado;

public class SomadorApp {
    public static void main(String[] args) {

        SomadorEsperado somador = new AdapterSomador();

        Cliente cliente = new Cliente(somador);
        cliente.executar();
    }
}
