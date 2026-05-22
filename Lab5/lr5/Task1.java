package Lab5.lr5;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("Исходный массив: " + Arrays.toString(input));

        int[] resultList = getEvenNumbersList(input);
        System.out.println("Четные числа (список): " + Arrays.toString(resultList));
    }

    public static int[] getEvenNumbersList(int[] numbers) {
        if (numbers == null) {
            return new int[0];
        }

        return Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .toArray();
    }
}
