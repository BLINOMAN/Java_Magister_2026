package Lab5.timus.task_1209;

import java.util.Scanner;

public class task_1209 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < N; i++) {
            long K = scanner.nextLong();
            char digit = findDigit(K);
            result.append(digit);
            if (i < N - 1) {
                result.append(" ");
            }
        }

        System.out.println(result);
        scanner.close();
    }

    private static char findDigit(long K) {
        long low = 0;
        long high = 100000;

        while (low < high) {
            long mid = (low + high) / 2;
            long cum = (mid + 1) * (mid + 2) / 2;
            if (cum >= K) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        long m = low;

        long prefix = m * (m + 1) / 2;

        long posInNumber = K - prefix;

        if (posInNumber == 1) {
            return '1';
        } else {
            return '0';
        }
    }
}
