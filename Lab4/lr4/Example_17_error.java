package Lab4.lr4;

import java.util.Scanner;

public class Example_17_error {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        byte[] arr = new byte[n];
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextByte();
            sum += arr[i];
        }
        
        System.out.println(sum);
        
        scanner.close();
    }
}
