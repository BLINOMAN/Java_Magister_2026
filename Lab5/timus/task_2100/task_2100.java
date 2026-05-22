package Lab5.timus.task_2100;

import java.util.Scanner;

public class task_2100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        int friends = 0;
        int partners = 0;

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine().trim();
            if (line.contains("+one")) {
                friends++;
                partners++;
            } else {
                friends++;
            }
        }

        int total = 2 + friends + partners;

        if (total == 13) {
            total++;
        }

        int cost = total * 100;
        System.out.println(cost);

        scanner.close();
    }
}
