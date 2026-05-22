package Lab5.lr5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "Java Programming", "Python", "JavaScript",
                "Hello World", "programming", "kotlin", null, "");

        List<String> filtered = filterBySubstring(words, "Java");

        System.out.println("Исходный список: " + words);
        System.out.println("Содержат 'Java': " + filtered);
    }

    public static List<String> filterBySubstring(List<String> strings, String substring) {
        if (strings == null || substring == null || substring.isEmpty()) {
            return new ArrayList<>();
        }

        return strings.stream()
                .filter(s -> s != null && s.contains(substring))
                .collect(Collectors.toList());
    }
}