package Lab2.timus.task_1877;

import java.util.Scanner;

public class task_1877 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String codeA = scanner.nextLine().trim();
        String codeB = scanner.nextLine().trim();
        
        int numA = Integer.parseInt(codeA);
        int numB = Integer.parseInt(codeB);
        
        boolean canCrackA = (numA % 2 == 0);
        
        boolean canCrackB = (numB % 2 == 1);
        
        if (canCrackA || canCrackB) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        
        scanner.close();
    }
}
