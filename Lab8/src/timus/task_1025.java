package timus;

import java.util.Arrays;
import java.util.Scanner;


public class task_1025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();
        int[] groups = new int[K];

        for (int i = 0; i < K; i++) {
            groups[i] = scanner.nextInt();
        }

        // Calculate minimal supporters needed for each group
        int[] needed = new int[K];
        for (int i = 0; i < K; i++) {
            needed[i] = groups[i] / 2 + 1;
        }

        // Sort in ascending order to pick the cheapest groups
        Arrays.sort(needed);

        // Number of groups needed to win: more than half -> floor(K/2) + 1
        int groupsToWin = K / 2 + 1;

        // Sum the smallest 'groupsToWin' values
        int minSupporters = 0;
        for (int i = 0; i < groupsToWin; i++) {
            minSupporters += needed[i];
        }

        System.out.println(minSupporters);
    }
}