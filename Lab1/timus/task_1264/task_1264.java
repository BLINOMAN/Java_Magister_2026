package timus.task_1264;

import java.util.Scanner;

public class task_1264 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите N число: ");
        int n = in.nextInt();

        System.out.println("Введите M число: ");
        int m = in.nextInt();

        System.out.println(n * (m + 1));
        in.close();
    }
}
