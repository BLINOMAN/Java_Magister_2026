package Lab5.lr5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task6 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 33, 40, null, 50);

        List<Integer> divisibleBy5 = filterDivisible(numbers, 5);
        List<Integer> divisibleBy3 = filterDivisible(numbers, 3);

        System.out.println("Исходный список: " + numbers);
        System.out.println("Делятся на 5:   " + divisibleBy5);
        System.out.println("Делятся на 3:   " + divisibleBy3);
    }

    public static List<Integer> filterDivisible(List<Integer> numbers, int divisor) {
        if (numbers == null) {
            return new ArrayList<>();
        }

        if (divisor == 0) {
            throw new IllegalArgumentException("Делитель не может быть равен нулю");
        }

        return numbers.stream()
                .filter(num -> num != null && num % divisor == 0)
                .collect(Collectors.toList());
    }
}