package Lab7.lr7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        String inputFileName = "C:\\Users\\boris\\Desktop\\Магистратура\\2 семестр\\Java\\Java_Magister_2026\\Lab7\\lr7\\input.txt";
        String outputFileName = "C:\\Users\\boris\\Desktop\\Магистратура\\2 семестр\\Java\\Java_Magister_2026\\Lab7\\lr7\\output.txt";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для файла: ");
        String data = scanner.nextLine();
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFileName))) {
            writer.write(data);
            System.out.println("Данные записаны в файл: " + inputFileName);
        } catch (IOException e) {
            System.out.println("Ошибка записи данных в файл: " + e.getMessage());
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFileName))) {
            PrintWriter printWriter = new PrintWriter(outputFileName, "UTF-8");
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                printWriter.println(line.toUpperCase());
            }
            System.out.println("Данные записаны в файл: " + outputFileName);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи" + e.getMessage());
        }

        scanner.close();
    }
}
