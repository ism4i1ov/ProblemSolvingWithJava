package hackerrank;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        System.out.println(divisibleSumPairs(6,3,new int[]{1,3,2,6,1,2}));;
    }

    static int divisibleSumPairs(int n, int k, int[] ar) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j && (ar[i] + ar[j]) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
