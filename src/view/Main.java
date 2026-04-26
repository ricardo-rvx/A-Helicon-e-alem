package view;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        long[] a = new long[n];
        long maxSum = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            if (a[i] > maxSum) {
                maxSum = a[i];
            }
        }

        for (int k = 1; k <= n / 2; k++) {
            for (int i = 0; i < k; i++) {
                long currentMax = a[i];
                long globalMaxForK = a[i];
                for (int j = i + k; j < n; j += k) {
                    currentMax = Math.max(a[j], currentMax + a[j]);
                    if (currentMax > globalMaxForK) {
                        globalMaxForK = currentMax;
                    }
                }
                if (globalMaxForK > maxSum) {
                    maxSum = globalMaxForK;
                }
            }
        }
        System.out.println(maxSum);
    }
}