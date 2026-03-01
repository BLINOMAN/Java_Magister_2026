package timus.task_1068;

import java.util.Scanner;

public class task_1068 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите N: ");
        int n = in.nextInt();

        int sum = 0;
        if (n < 0) {
            for (int i = 1; i >= n; i--) {
                sum += i;
            }
        }
        else {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
        }
        
        System.out.println(sum);

        in.close();
    }
}
