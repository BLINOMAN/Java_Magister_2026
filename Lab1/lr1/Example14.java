package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int value = in.nextInt();

        int plus_one = value + 1;
        int minus_one = value - 1;
        int squared_value = (value+plus_one+minus_one)*(value+plus_one+minus_one);

        System.out.println(minus_one + " " + value + " "+  plus_one + " " + squared_value);
        in.close();
    }
}
