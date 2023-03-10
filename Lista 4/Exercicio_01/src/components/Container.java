package components;

import java.util.Scanner;

import components.out.Out;

public class Container {

    private Form[] form;

    public Container(int tamanho) {
        this.form = new Form[tamanho];
    }

    public void add() {

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < form.length; i++) {

            System.out.print((i + 1) + "º conteúdo: ");
            this.form[i] = new Form(scan.nextLine());
        }
        System.out.println();
        scan.close();
    }

    public void print(Out o) {

        for (Form f : form) {
            o.flush(f);
        }
    }
}
