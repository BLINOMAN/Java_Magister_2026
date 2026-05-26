package Lab7.lr7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        String inputFileName = "C:\\Users\\boris\\Desktop\\Магистратура\\2 семестр\\Java\\Java_Magister_2026\\Lab7\\lr7\\input.txt";
        String outputFileName = "output.txt";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для файла: ");
        String data = scanner.nextLine();
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFileName))) {
            writer.write(data);
            System.out.println("Данные записаны в файл: " + inputFileName);
        } catch (IOException e) {
            System.out.println("Ошибка записи данных в файл: " + e.getMessage());
        }

        try (InputStream inputStream = new FileInputStream(inputFileName)) {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            
            OutputStream outputStream = new FileOutputStream(outputFileName);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line.toUpperCase());
                bufferedWriter.newLine();
            }
            System.out.println("Данные записаны в файл: " + outputFileName);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи" + e.getMessage());
        }
        scanner.close();
    }
}
