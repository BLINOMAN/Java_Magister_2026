package lr1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите фамилию: ");
        String last_name = in.nextLine();

        System.out.println("Введите имя: ");
        String first_name = in.nextLine();

        System.out.println("Введите отчество (при наличии): ");
        String otchestvo = in.nextLine();

        System.out.println("Hello " + last_name + " " + first_name + " " + otchestvo);
        in.close();
    }
}
