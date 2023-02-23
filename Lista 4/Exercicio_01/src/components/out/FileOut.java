package components.out;

import java.io.FileWriter;
import java.io.IOException;
import components.Form;

public class FileOut implements Out {

    private FileWriter writer;

    public FileOut(String fileName) throws IOException {
        this.writer = new FileWriter(fileName);
    }

    @Override
    public void flush(Form f) {

        try {
            writer.write(f + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writerAppend() throws IOException {
        writer.append("End...");
    }

    public void writerClose() throws IOException {
        writer.close();
    }
}
