package Lab4.lr4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива N: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                throw new IllegalArgumentException("Размер массива должен быть положительным!");
            }

            byte[] arr = new byte[n];
            int sum = 0; // используем int для суммы, чтобы избежать переполнения

            System.out.println("Введите " + n + " элементов типа byte (-128..127):");

            for (int i = 0; i < n; i++) {
                System.out.print("Элемент " + (i + 1) + ": ");
                arr[i] = scanner.nextByte(); // Может выбросить InputMismatchException
                sum += arr[i];
            }

            System.out.println("Сумма элементов массива: " + sum);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено некорректное значение!");
            System.out.println("Ожидалось целое число в диапазоне byte (-128..127).");
        } catch (NegativeArraySizeException e) {
            System.out.println("Ошибка: размер массива не может быть отрицательным.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла непредвиденная ошибка: " +
                    e.getClass().getName() + " — " + e.getMessage());
        } finally {
            System.out.println("Программа завершила работу.");
            scanner.close();
        }
    }
}
