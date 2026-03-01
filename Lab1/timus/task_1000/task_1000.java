package timus.task_1000;

import java.util.Scanner;

public class task_1000 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int first_value = in.nextInt();

        System.out.println("Введите второе число: ");
        int second_value = in.nextInt();

        System.out.println(first_value+second_value);
        in.close();
    }
}
