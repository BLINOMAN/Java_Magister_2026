package Lab7.lr7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите возраст: ");
        int age = scanner.nextInt();

        Person person = new Person(name, age);
        
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("person.json");
            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);

            out.writeObject(person);
            out.close();

            fileOutputStream.close();
            System.out.println("Сериализованная информаиция сохранена в person.ser");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        scanner.close();
    }
}
