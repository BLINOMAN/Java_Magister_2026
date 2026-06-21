package Lab3.timus.task_1224;

import java.util.Scanner;

public class task_1224 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        
        if (n > m) {
            long temp = n;
            n = m;
            m = temp;
        }
        
        long turns;
        if (n == 1) {
            turns = 0;
        } else {
            turns = 2 * (n - 1);
        }
        
        System.out.println(turns);
        scanner.close();
    }
}
