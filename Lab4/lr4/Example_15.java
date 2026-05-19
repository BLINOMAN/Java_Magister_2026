package Lab4.lr4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива N: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                throw new IllegalArgumentException("Размер массива должен быть положительным!");
            }

            int[] arr = new int[n];
            int positiveSum = 0;
            int positiveCount = 0;

            System.out.println("Введите " + n + " элементов массива:");

            for (int i = 0; i < n; i++) {
                System.out.print("Элемент " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();

                if (arr[i] > 0) {
                    positiveSum += arr[i];
                    positiveCount++;
                }
            }

            if (positiveCount == 0) {
                throw new ArithmeticException("В массиве нет положительных элементов!");
            }

            double average = (double) positiveSum / positiveCount;
            System.out.printf("Среднее значение среди положительных элементов: %.2f%n", average);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено некорректное значение! Ожидалось целое число.");
        } catch (NegativeArraySizeException e) {
            System.out.println("Ошибка: размер массива не может быть отрицательным.");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла непредвиденная ошибка: " + e.getClass().getName());
        } finally {
            System.out.println("Программа завершила работу.");
            scanner.close();
        }
    }
}