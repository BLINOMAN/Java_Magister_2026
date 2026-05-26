package Lab7.timus.timus_1581;

import java.util.Scanner;

public class timus_1581 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        scanner.nextLine();
        String[] splited_numbers = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(splited_numbers[i]);
        }

        StringBuilder result = new StringBuilder();

        int i = 0;
        while (i < n) {
            int count = 1;
            int current = numbers[i];

            while (i + count < n && numbers[i + count] == current) {
                count++;
            }

            result.append(count).append(" ").append(current).append(" ");
            i += count;
        }

        System.out.println(result.toString().trim());
        scanner.close();
    }
}
