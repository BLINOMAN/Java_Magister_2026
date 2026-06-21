package Lab3.timus.task_1617;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class task_1617 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            freq.put(d, freq.getOrDefault(d, 0) + 1);
        }

        int result = 0;
        for (int count : freq.values()) {
            result += count / 4;
        }

        System.out.println(result);
        scanner.close();
    }
}
