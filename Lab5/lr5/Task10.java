package Lab5.lr5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task10 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 8, 3, 15, 7, -2, 20, null, 10, -5);

        List<Integer> lessThan10 = filterLessThan(numbers, 10);
        List<Integer> lessThan0 = filterLessThan(numbers, 0);

        System.out.println("Исходный список: " + numbers);
        System.out.println("Меньше 10:       " + lessThan10);
        System.out.println("Меньше 0:        " + lessThan0);
    }

    public static List<Integer> filterLessThan(List<Integer> numbers, int threshold) {
        if (numbers == null) {
            return new ArrayList<>();
        }

        return numbers.stream()
                .filter(num -> num != null && num < threshold)
                .collect(Collectors.toList());
    }
}
