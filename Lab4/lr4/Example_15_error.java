package Lab4.lr4;

import java.util.Scanner;

public class Example_15_error {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        int positiveSum = 0;
        int positiveCount = 0;
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > 0) {
                positiveSum += arr[i];
                positiveCount++;
            }
        }
        
        double average = (double) positiveSum / positiveCount;
        System.out.printf("%.2f%n", average);
        
        scanner.close();
    }
}