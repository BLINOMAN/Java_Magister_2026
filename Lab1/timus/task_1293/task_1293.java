package timus.task_1293;

import java.util.Scanner;

class task_1293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите N: ");
        int n = in.nextInt();

        System.out.println("Введите A: ");
        int a = in.nextInt();

        System.out.println("Введите B: ");
        int b = in.nextInt();

        System.out.println(n * a * b * 2);
        in.close();
    }
}
