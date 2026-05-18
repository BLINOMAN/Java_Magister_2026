import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] agrs) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = id.nextInt();
        System.out.println("Размер массива равен "+size);
        id.close();
        int[] nums = new int[size];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива ["+i+"] = "+nums[i]);
        }
        
        int[] sorted_nums = nums.clone();
        Arrays.sort(sorted_nums);

        int min_value = sorted_nums[0];

        System.out.println("Произведена сортировка массива");

        // System.out.println();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == min_value)
                System.out.println("Индекс: "+i+". Значение: "+nums[i]);
        }
    }
}