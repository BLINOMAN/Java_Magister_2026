package Lab4.lr4;

import java.util.Scanner;

public class Example_16_error {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int[][] matrix = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        int col = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println(matrix[i][col]);
        }
        
        scanner.close();
    }
}

