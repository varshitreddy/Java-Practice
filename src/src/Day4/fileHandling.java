package Day4;


//THIS IS TO LEARN FILE HANDLING

import java.io.FileWriter;
import java.io.IOException;

public class fileHandling {

    public  void addData(FileWriter file) throws IOException {
        file.write("Agueroooooooooo");
    }
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("test.txt");
        fileHandling fh = new fileHandling();
        fh.addData(file);
        file.close();
    }
}
