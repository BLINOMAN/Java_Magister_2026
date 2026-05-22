package Lab5.lr5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task7 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "Java", "Python", "Kotlin", "C",
                "JavaScript", "Go", "", null, "HelloWorld");

        List<String> longWords = filterByLength(words, 4);

        System.out.println("Исходный список: " + words);
        System.out.println("Строки длиннее 4 символов: " + longWords);
    }

    public static List<String> filterByLength(List<String> strings, int minLength) {
        if (strings == null) {
            return new ArrayList<>();
        }

        final int lengthThreshold = Math.max(minLength, 0);

        return strings.stream()
                .filter(s -> s != null && s.length() > lengthThreshold)
                .collect(Collectors.toList());
    }
}