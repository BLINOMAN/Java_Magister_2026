package Lab6.timus.task_1225;

import java.util.Scanner;

public class task_1225 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        long[][] dp = new long[n + 1][4];
        
        dp[1][0] = 1;
        dp[1][1] = 1;
        
        for (int i = 2; i <= n; i++) {
            dp[i][1] += dp[i-1][0];
            dp[i][2] += dp[i-1][0];
            dp[i][0] += dp[i-1][1];
            dp[i][3] += dp[i-1][1];
            dp[i][1] += dp[i-1][2];
            dp[i][0] += dp[i-1][3];
        }
        
        long answer = dp[n][0] + dp[n][1];
        
        System.out.println(answer);
        scanner.close();
    }
}
