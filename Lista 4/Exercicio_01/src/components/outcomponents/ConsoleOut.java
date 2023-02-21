package components.outcomponents;

import components.Form;
import components.Out;

public class ConsoleOut implements Out {

    @Override
    public void flush(Form f) {
        System.out.println(f);
    }
}
