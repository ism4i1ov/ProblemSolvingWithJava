package hackerrank;

public class TheHurdleRace {
    public static void main(String[] args) {
        System.out.println(hurdleRace(4, new int[]{1, 6, 3, 5, 2}));
    }

    static int hurdleRace(int k, int[] height) {
        int max = 0;
        for (int value : height) {
            if (max < value) {
                max = value;
            }
        }
        if(max > k){
            return max - k;
        }
        return 0;
    }
}
