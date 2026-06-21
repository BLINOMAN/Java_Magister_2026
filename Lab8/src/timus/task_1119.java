package timus;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class task_1119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        Set<String> diagonal = new HashSet<>();
        for (int i = 0; i < K; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            diagonal.add(x + "," + y);
        }

        double[][] dp = new double[N + 1][M + 1];
        // Инициализация большими значениями
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= M; j++) {
                dp[i][j] = Double.POSITIVE_INFINITY;
            }
        }
        dp[0][0] = 0.0;

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= M; j++) {
                if (i == 0 && j == 0) continue;
                // Пришли снизу (с юга)
                if (j > 0) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][j - 1] + 100.0);
                }
                // Пришли слева (с запада)
                if (i > 0) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j] + 100.0);
                }
                // Пришли по диагонали (из юго-западного угла)
                if (i > 0 && j > 0 && diagonal.contains(i + "," + j)) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - 1] + 100.0 * Math.sqrt(2));
                }
            }
        }

        long result = Math.round(dp[N][M]);
        System.out.println(result);
    }
}
