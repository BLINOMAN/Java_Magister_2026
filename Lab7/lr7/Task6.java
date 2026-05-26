package Lab7.lr7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите путь к файлу: ");
        String filePath = scanner.nextLine();
        
        System.out.print("Введите слово для поиска: ");
        String searchWord = scanner.nextLine();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 0;
            int foundCount = 0;
            
            System.out.println("\nРезультаты поиска слова \"" + searchWord + "\":");
            
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                if (line.contains(searchWord)) {
                    foundCount++;
                    System.out.println("Строка " + lineNumber + ": " + line);
                }
            }
            
            if (foundCount == 0) {
                System.out.println("Слово не найдено в файле.");
            } else {
                System.out.println("Всего найдено: " + foundCount + " строк");
            }
            
        } catch (FileNotFoundException e) {
            System.err.println("Ошибка: Файл не найден - " + filePath);
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
        
        scanner.close();
    }
}
