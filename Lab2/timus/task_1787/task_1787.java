package Lab2.timus.task_1787;

import java.util.Scanner;

public class task_1787 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] k_n = scanner.nextLine().split(" ");

        int k = Integer.parseInt(k_n[0]);
        int n = Integer.parseInt(k_n[1]);
        
        int queue = 0;
        
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            queue += a;
            if (queue > k) {
                queue -= k;
            } else {
                queue = 0;
            }
        }
        
        System.out.println(queue);
        
        scanner.close();
    }
}
