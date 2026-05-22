package Lab5.lr5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task9 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "Hello", "World123", "Привет", "Java",
                "12345", "Test!", "Kotlin", "", null,
                "Hello World", "Москва", "abc123def");

        List<String> onlyLetters = filterLettersOnly(words);

        System.out.println("Исходный список: " + words);
        System.out.println("Только буквы:    " + onlyLetters);
    }

    public static List<String> filterLettersOnly(List<String> strings) {
        if (strings == null) {
            return new ArrayList<>();
        }

        return strings.stream()
                .filter(s -> s != null && !s.isEmpty() &&
                        s.chars().allMatch(Character::isLetter))
                .collect(Collectors.toList());
    }
}