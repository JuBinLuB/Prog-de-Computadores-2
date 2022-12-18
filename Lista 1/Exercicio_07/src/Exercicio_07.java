import components.Invoice;

public class Exercicio_07 {
    public static void main(String[] args) {

        Invoice invoice = new Invoice(1, 30, "Mouse", 31.49);

        double fatura = invoice.getInvoiceAmount();

        System.out.printf("A fatura é: %.2f\n", fatura);
        System.out.println();
    }

}
