package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите день недели: ");
        String day_week_name = in.nextLine();

        System.out.println("Введите название месяца: ");
        String month_name = in.nextLine();

        System.out.println("Введите день месяца: ");
        int day = in.nextInt();

        System.out.println(day + " " + month_name + ", " + day_week_name);
        in.close();
    }
}
