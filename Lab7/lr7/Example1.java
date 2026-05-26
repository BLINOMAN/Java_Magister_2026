package Lab7.lr7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        File folder = new File("/example_folder");
        Scanner scanner = new Scanner(System.in);

        if (!folder.exists()) {
            if (folder.mkdir()) {
                System.out.println("Папка создана: " + folder.getAbsolutePath());
            } else {
                System.out.println("Не удалось создать папку: " + folder.getAbsolutePath());
            }
        } else {
            System.out.println("Папка уже существует: " + folder.getAbsolutePath());
        }
        System.out.println("Введите имя файла:");
        String fileName = scanner.nextLine();
        
        File file = new File(folder.getAbsolutePath() + File.separator + fileName);

        try {
            if (file.createNewFile()) {
                System.out.println("Файл создан: " + file.getAbsolutePath());
            } else {
                System.out.println("Не удалось создать файл: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла: " + e.getMessage());
        }

        if (file.delete()) {
            System.out.println("Файл удален: " + file.getAbsolutePath());
        } else { 
            System.out.println("Не удалось удалить файл: " + file.getAbsolutePath());
        }
        
        if (folder.delete()) {
            System.out.println("Папка удален: " + folder.getAbsolutePath());
        } else { 
            System.out.println("Не удалось удалить папка: " + folder.getAbsolutePath());
        }
        scanner.close();
    }
}
