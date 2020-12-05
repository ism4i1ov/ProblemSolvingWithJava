package hackerrank;

public class AppleAndOrange {
    public static void main(String[] args) {
        countApplesAndOranges(2, 3, 1, 5, new int[]{2}, new int[]{-2});
    }

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int appleFallSamHouse = 0;
        int orangeFallSamHouse = 0;

        for (int i : apples) {
            int result = a + i;
            if (result >= s && result <= t) {
                appleFallSamHouse++;
            }
        }
        for (int i : oranges) {
            int result = b + i;
            if (result >= s && result <= t) {
                orangeFallSamHouse++;
            }
        }

        System.out.println(appleFallSamHouse + "\n" + orangeFallSamHouse);
    }
}
