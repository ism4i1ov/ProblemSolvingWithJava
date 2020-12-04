public class MiniMaxSum {
    public static void main(String[] args) {

    }

    static void miniMaxSum(int[] arr) {
        long max = 0;
        long min = Long.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            long result = 0;
            for (int j = 0; j < arr.length; j++) {
                if(i == j){
                    continue;
                }else{
                    result += arr[j];
                }
            }
            if(result > max){
                max = result;
            }
            if(result < min){
                min = result;
            }
        }
        System.out.println(min + " " + max);
    }
}
