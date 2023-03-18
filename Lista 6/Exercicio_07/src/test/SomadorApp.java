package test;

import components.AdapterSomador;
import components.Cliente;
import components.SomadorEsperado;
import components.SomadorExistente;

public class SomadorApp {
    public static void main(String[] args) {

        SomadorEsperado somadorEsperado = new AdapterSomador(new SomadorExistente());

        Cliente cliente = new Cliente(somadorEsperado);
        cliente.executar();
    }
}
