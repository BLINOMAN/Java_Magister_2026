package lr1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String first_name = in.nextLine();

        System.out.println("Введите ваш возраст: ");
        int age = in.nextInt();

        System.out.println("Name " + first_name);
        System.out.println("Age " + age);
        in.close();
    }
}