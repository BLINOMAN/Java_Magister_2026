package Lab5.lr5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "Яблоко", "банан", "Вишня", "фрукт",
                "Смородина", "киви", "Проверочка", "", null, "123abc");

        List<String> filtered = filterCapitalStart(words);

        System.out.println("Исходный список: " + words);
        System.out.println("Строки с большой буквы: " + filtered);
    }

    public static List<String> filterCapitalStart(List<String> strings) {
        if (strings == null) {
            return new ArrayList<>();
        }

        return strings.stream()
                .filter(s -> s != null && !s.isEmpty() && Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }
}