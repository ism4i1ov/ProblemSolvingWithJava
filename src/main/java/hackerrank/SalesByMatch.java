package hackerrank;

import java.util.*;

public class SalesByMatch {
    public static void main(String[] args) {
        System.out.println(sockMerchant(0, new int[]{6, 5, 2, 3, 5, 2, 2, 1, 1, 5, 1, 3, 3, 3, 5}));
    }

    static int sockMerchant(int n, int[] ar) {
        Arrays.sort(ar);
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (ar[i] == ar[j] && i != j && (ar[i] != 0 && ar[j] != 0)) {
                    count++;
                    ar[i] = 0;
                    ar[j] = 0;
                }
            }
        }
        return count;
    }
}
