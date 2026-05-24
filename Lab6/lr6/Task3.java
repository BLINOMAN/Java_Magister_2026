package Lab6.lr6;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[10];

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Массив: " + java.util.Arrays.toString(array));

        int result = parallelSum(array);

        System.out.println("Сумма: " + result);
        System.out.println("Результат " + result);
    }

    public static int parallelSum(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }

        int cores = Runtime.getRuntime().availableProcessors();
        int chunkSize = (int) Math.ceil((double) array.length / cores);

        AtomicInteger totalSum = new AtomicInteger(0);

        Thread[] threads = new Thread[cores];

        for (int i = 0; i < cores; i++) {
            final int start = i * chunkSize;
            final int end = Math.min(start + chunkSize, array.length);

            threads[i] = new Thread(() -> {
                int partialSum = 0;
                for (int j = start; j < end; j++) {
                    partialSum += array[j];
                }
                totalSum.addAndGet(partialSum);
            });

            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        return totalSum.get();
    }

    
}