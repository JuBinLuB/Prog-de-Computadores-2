import components.Aniversario;
import components.CartaoWeb;
import components.DiaDosNamorados;
import components.Natal;

public class CartaoWebApp {
    public static void main(String[] args) {

        CartaoWeb[] cartao = new CartaoWeb[3];

        cartao[0] = new DiaDosNamorados("Kaguya");
        cartao[1] = new Natal("Nino");
        cartao[2] = new Aniversario("Azusa");

        for (CartaoWeb cartaoWeb : cartao) {
            cartaoWeb.showMessage();
        }
    }
}
