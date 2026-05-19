package Lab4.lr4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Ввод размеров матрицы
            System.out.print("Введите количество строк (N): ");
            int n = scanner.nextInt();

            System.out.print("Введите количество столбцов (M): ");
            int m = scanner.nextInt();

            if (n <= 0 || m <= 0) {
                throw new IllegalArgumentException("Размеры матрицы должны быть положительными!");
            }

            int[][] matrix = new int[n][m];

            // Заполнение матрицы
            System.out.println("Введите элементы матрицы (" + n + "x" + m + "):");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print("matrix[" + i + "][" + j + "] = ");
                    matrix[i][j] = scanner.nextInt();
                }
            }

            // Ввод номера столбца
            System.out.print("Введите номер столбца (от 0 до " + (m - 1) + "): ");
            int col = scanner.nextInt();

            // Проверка корректности номера столбца
            if (col < 0 || col >= m) {
                throw new IllegalArgumentException(
                        "Столбца с номером " + col + " не существует! Допустимый диапазон: 0.." + (m - 1));
            }

            // Вывод столбца
            System.out.println("Столбец № " + col + ":");
            for (int i = 0; i < n; i++) {
                System.out.println(matrix[i][col]);
            }

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено некорректное значение! Ожидалось целое число.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (NegativeArraySizeException e) {
            System.out.println("Ошибка: размер массива не может быть отрицательным.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: выход за пределы массива.");
        } catch (Exception e) {
            System.out.println("Произошла непредвиденная ошибка: " + e.getClass().getName() + " - " + e.getMessage());
        } finally {
            System.out.println("Программа завершила работу.");
            scanner.close();
        }
    }
}
