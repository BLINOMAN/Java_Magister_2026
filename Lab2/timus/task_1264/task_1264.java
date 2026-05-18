package Lab2.timus.task_1264;

import java.util.Scanner;

public class task_1264 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        long seconds = (long) N * (M + 1);
        System.out.println(seconds);
        
        scanner.close();
    }
}
