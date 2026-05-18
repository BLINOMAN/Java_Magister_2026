import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите количество строк в массиве: ");
        int rows = id.nextInt();
        System.out.println("Введите количество столбцов в массиве: ");
        int cols = id.nextInt();
        id.close();

        int[][] matrix = new int[rows][cols];
        int counter = 1;
        
        for (int r = 0; r < rows; r++) {
            if (r % 2 == 0) {
                // Четные строки (0, 2, 4, ...) - Заполняем слева направо (Forward)
                for (int c = 0; c < cols; c++) {
                    matrix[r][c] = counter++;
                }
            } else {
                // Нечетные строки (1, 3, 5, ...) - Заполняем справа налево (Backward)
                for (int c = cols - 1; c >= 0; c--) {
                    matrix[r][c] = counter++;
                }
            }
        }

        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%3d ", val);
            }
            System.out.println();
        }
    }
}
