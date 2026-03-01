package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название месяца: ");
        String month_name = in.nextLine();

        System.out.println("Введите максимальное количество дней в этом месяце: ");
        int day = in.nextInt();

        System.out.println(month_name + " содержит в себе максимум " + day + " дней");
        in.close();
    }
}
