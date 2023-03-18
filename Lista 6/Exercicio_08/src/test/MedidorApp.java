package test;

import components.AdapterMedidor;
import components.MedidorCelsiusIF;
import components.MedidorFarenheit;

public class MedidorApp {
    public static void main(String[] args) {

        MedidorCelsiusIF medidor = new AdapterMedidor(new MedidorFarenheit());
        double temperatura = medidor.medirTemperatura();

        System.out.println(temperatura);
    }
}
