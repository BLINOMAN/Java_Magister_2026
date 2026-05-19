package Lab4.timus.task_1820;

import java.util.Scanner;

public class task_1820 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] n_k = scanner.nextLine().split(" ");

        int n = Integer.parseInt(n_k[0]);
        int k = Integer.parseInt(n_k[1]);

        if (n == 0) {
            System.out.println(0);
            scanner.close();
            return;
        }
        
        int totalSides = 2 * n;
        int minutes = (totalSides + k - 1) / k;
        int answer = Math.max(minutes, 2);
        
        System.out.println(answer);
        
        scanner.close();
    }
}
