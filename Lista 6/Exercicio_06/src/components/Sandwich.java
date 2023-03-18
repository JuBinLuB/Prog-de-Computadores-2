package components;

import components.product.PaoIF;
import components.product.PresuntoIF;
import components.product.QueijoIF;
import components.product.SaladaIF;

public class Sandwich {

    private PaoIF pao;
    private QueijoIF queijo;
    private PresuntoIF presunto;
    private SaladaIF salada;

    public Sandwich(PaoIF pao, QueijoIF queijo, PresuntoIF presunto, SaladaIF salada) {
        this.pao = pao;
        this.queijo = queijo;
        this.presunto = presunto;
        this.salada = salada;
    }

    public PaoIF getPao() {
        return pao;
    }

    public QueijoIF getQueijo() {
        return queijo;
    }

    public PresuntoIF getPresunto() {
        return presunto;
    }

    public SaladaIF getSalada() {
        return salada;
    }

    @Override
    public String toString() {
        return "Sanduiche:" +
                "\n" + getPao().descricao() +
                "\n" + getQueijo().descricao() +
                "\n" + getPresunto().descricao() +
                "\n" + getSalada().descricao() + "\n";
    }
}
