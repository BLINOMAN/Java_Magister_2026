package Lab5.lr5;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task8 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 8, 3, 15, 7, 20, null, -1, 10);

        List<Integer> greaterThan10 = filterGreaterThan(numbers, 10);
        List<Integer> greaterThan5 = filterGreaterThan(numbers, 5);

        System.out.println("Исходный список: " + numbers);
        System.out.println("Больше 10:       " + greaterThan10);
        System.out.println("Больше 5:        " + greaterThan5);
    }

    public static List<Integer> filterGreaterThan(List<Integer> numbers, int threshold) {
        if (numbers == null) {
            return new ArrayList<>();
        }

        return numbers.stream()
                .filter(num -> num != null && num > threshold)
                .collect(Collectors.toList());
    }
}