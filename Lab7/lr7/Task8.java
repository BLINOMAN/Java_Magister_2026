package Lab7.lr7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Task8 {
    public static void main(String[] args) {
        String fileName = "person.ser";
        
        Person_Serializable person = new Person_Serializable("Иван Петров", 30);

        System.out.println("Имя (оригинальный): " + person.getName());
        System.out.println("Возраст (оригинальный): " + person.getAge());

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream(fileName))) {
            objectOutputStream.writeObject(person);
            System.out.println("Объект успешно сохранен в файл: " + fileName);
        } catch (IOException e) {
            System.err.println("Ошибка при сохранении объекта: " + e.getMessage());
        }
        
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(fileName))) {
            Person_Serializable restoredPerson = (Person_Serializable) ois.readObject();

            System.out.println("Имя (восстановленный): " + restoredPerson.getName());
            System.out.println("Возраст (восстановленный): " + restoredPerson.getAge());
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Ошибка при чтении объекта: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Класс не найден: " + e.getMessage());
        }
    }
}
