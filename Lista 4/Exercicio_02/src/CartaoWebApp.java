import components.Aniversario;
import components.CartaoWeb;
import components.DiaDosNamorados;
import components.Natal;

public class CartaoWebApp {
    public static void main(String[] args) {

        CartaoWeb[] cartao = new CartaoWeb[3];

        cartao[0] = new DiaDosNamorados("Nino");
        cartao[1] = new Natal("Emilia");
        cartao[2] = new Aniversario("Mari");

        for (CartaoWeb cartaoWeb : cartao) {
            cartaoWeb.showMessage();
        }
    }
}
