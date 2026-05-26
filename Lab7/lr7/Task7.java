package Lab7.lr7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите название файла: ");
        String fileName = scanner.nextLine();
        
        System.out.println("Введите текст для записи в файл:");
        System.out.println("(для завершения ввода введите пустую строку)");
        
        StringBuilder text = new StringBuilder();
        String line;
        
        while (!(line = scanner.nextLine()).isEmpty()) {
            text.append(line).append(System.lineSeparator());
        }
        
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(text.toString());
            System.out.println("Текст успешно записан в файл: " + fileName);
            System.out.println("Количество записанных символов: " + text.length());
            
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
        
        scanner.close();
    }
}
