package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int first_value = in.nextInt();

        System.out.println("Введите второе число: ");
        int second_value = in.nextInt();

        System.out.println("Сумма двух чисел = " + (first_value+second_value));
        System.out.println("Разница двух чисел = " + (first_value-second_value));
        in.close();
    }
}
