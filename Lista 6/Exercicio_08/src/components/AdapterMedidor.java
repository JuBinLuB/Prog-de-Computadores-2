package components;

import java.util.Objects;

public class AdapterMedidor implements MedidorCelsiusIF {

    private MedidorFarenheit medidor;

    public AdapterMedidor(MedidorFarenheit medidor) {
        Objects.requireNonNull(medidor, "Medidor não pode ser nulo.");
        this.medidor = medidor;
    }

    @Override
    public double medirTemperatura() {
        double celsius = (medidor.getTemperaturaFarenheit() - 32) / 1.8;
        return celsius;
    }
}
