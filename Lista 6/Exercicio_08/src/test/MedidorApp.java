package test;

import components.AdapterMedidor;
import components.MedidorCelsiusIF;
import components.MedidorFarenheit;

public class MedidorApp {
    public static void main(String[] args) {

        MedidorFarenheit medidorFarenheit = new MedidorFarenheit();
        MedidorCelsiusIF medidor = new AdapterMedidor(medidorFarenheit);
        double temperatura = medidor.medirTemperatura();

        System.out.println(temperatura);
    }
}
