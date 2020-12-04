public class AVeryBigSum {
    public static void main(String[] args) {

    }

    static long aVeryBigSum(long[] ar) {
        long result = 0;
        for (long i : ar) {
            result += i;
        }
        return result;
    }
}
