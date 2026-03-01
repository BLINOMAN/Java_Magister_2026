package lr1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите год рождения: ");
        int year = in.nextInt();

        System.out.println("На сегодняшний день вам " + (2025-year) + " лет");
        in.close();
    }
}
