package Lab4.timus.task_1197;

import java.util.Scanner;

public class task_1197 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        
        for (int test = 0; test < N; test++) {
            String pos = scanner.nextLine().trim();
            char file = pos.charAt(0);
            char rank = pos.charAt(1);
            
            int x = file - 'a';
            int y = rank - '1';
            
            int count = 0;
            
            // Все 8 возможных ходов коня
            int[][] moves = {
                {2, 1}, {2, -1}, {-2, 1}, {-2, -1},
                {1, 2}, {1, -2}, {-1, 2}, {-1, -2}
            };
            
            for (int[] move : moves) {
                int nx = x + move[0];
                int ny = y + move[1];
                if (nx >= 0 && nx < 8 && ny >= 0 && ny < 8) {
                    count++;
                }
            }
            
            System.out.println(count);
        }
        
        scanner.close();
    }
}