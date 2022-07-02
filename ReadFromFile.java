package sample;
import java.io.*;

public class ReadFromFile extends FilePath {

    public void ReadFromFile() {
        String line;
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(""));
            line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
