package Lab7.timus.timus_1924;

import java.util.Scanner;

public class timus_1924 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int remainder = n % 4;
        
        if (remainder == 0 || remainder == 3) {
            System.out.println("black");
        } else {
            System.out.println("grimy");
        }
        
        scanner.close();
    }
}
