package Lab5.lr5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, -3, null, 10);

        List<Integer> squares = squareNumbers(nums);

        System.out.println("Исходный список: " + nums);
        System.out.println("Квадраты: " + squares);
    }

    public static List<Integer> squareNumbers(List<Integer> numbers) {
        if (numbers == null) {
            return new ArrayList<>();
        }

        return numbers.stream()
                .map(num -> num == null ? null : num * num)
                .collect(Collectors.toList());
    }
}