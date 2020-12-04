public class PlusMinus {
    public static void main(String[] args) {

    }

    static void plusMinus(int[] arr) {
        double positiveNumbersCount = 0;
        double negativeNumbersCount = 0;
        double zeroNumbersCount = 0;

        for (int i : arr) {
            if(i > 0){
                positiveNumbersCount++;
            }else if(i < 0){
                negativeNumbersCount++;
            }else{
                zeroNumbersCount++;
            }
        }

        System.out.println(positiveNumbersCount / arr.length);
        System.out.println(negativeNumbersCount / arr.length);
        System.out.println(zeroNumbersCount / arr.length);
    }
}
