package Lab7.lr7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task4 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("input.txt");
        FileWriter writer = new FileWriter("output.txt");

        int c;
        while ((c = reader.read()) != -1) {
            writer.write(c);
        }
        reader.close();
        writer.close();
        System.out.println("Файл успешно скопирован!");
    }
}
