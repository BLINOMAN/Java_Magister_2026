package Lab2.timus.task_2001;

import java.util.Scanner;

public class task_2001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Первая строка
        String[] first_str = scanner.nextLine().split(" ");

        int a1 = Integer.parseInt(first_str[0]);
        int b1 = Integer.parseInt(first_str[1]);
        
        // Вторая строка
        String[] second_str = scanner.nextLine().split(" ");

        int a2 = Integer.parseInt(second_str[0]);
        int b2 = Integer.parseInt(second_str[1]);
        
        // Третья строка
        String[] third_str = scanner.nextLine().split(" ");

        int a3 = Integer.parseInt(third_str[0]);
        int b3 = Integer.parseInt(third_str[1]);

        int A = a1 - a3;
        int B = b1 - b2;
        
        System.out.println(A + " " + B);
        
        scanner.close();
    }
}