import java.io.IOException;

import components.Container;
import components.out.Out;
import components.out.ConsoleOut;
import components.out.FileOut;

public class OutApp {
    public static void main(String[] args) {

        Container container = new Container(3);
        container.add();

        // Saída no console.
        Out consoleOut = new ConsoleOut();
        container.print(consoleOut);

        // Saída em arquivo de texto.
        Out fileOut;
        try {
            fileOut = new FileOut("Form content.txt");
            container.print(fileOut);
            ((FileOut) fileOut).writerAppend();
            ((FileOut) fileOut).writerClose();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
