public class SimpleArraySum {
    public static void main(String[] args) {
        System.out.println(simpleArraySum(new int[] {1,2,3,4,10,11}));
    }

    static int simpleArraySum(int[] ar) {
        int result = 0;
        for (int value : ar) {
            result += value;
        }
        return result;
    }
}
