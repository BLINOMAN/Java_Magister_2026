package Lab6.lr6;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(100);
        }

        System.out.println("Массив: " + java.util.Arrays.toString(arr));
        int max = findMax(arr);
        System.out.println("Максимальный элемент: " + max);
    }

    public static int findMax(int[] array) {
        if (array.length == 1) {
            return array[0];
        }

        int cores = Runtime.getRuntime().availableProcessors();
        int maxPerThread = (int) Math.ceil((double) array.length / cores);

        int[] localMaxArray = new int[cores];

        for (int i = 0; i < cores; i++) {
            final int threadi = i;
            int start = i * maxPerThread;
            int end = Math.min(start + maxPerThread, array.length);

            Thread thread = new Thread(() -> {
                int localMax = -1000;
                for (int j = start; j < end; j++) {
                    if (array[j] > localMax) {
                        localMax = array[j];
                    }
                }
                localMaxArray[threadi] = localMax;
            });

            thread.start();
        }

        int max = -1000;

        for (final int i : localMaxArray) {
            if (max < i) {
                max = i;
            }
        }

        return max;
    }

    
}