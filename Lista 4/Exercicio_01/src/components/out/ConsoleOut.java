package components.out;

import components.Form;

public class ConsoleOut implements Out {

    @Override
    public void flush(Form f) {
        System.out.println(f);
    }
}
