package hackerrank;

public class FindDigits {
    public static void main(String[] args) {
        System.out.println(findDigits(1012));
    }

    static int findDigits(int n) {
        int count = 0;
        int temp = n;

        while (temp > 0) {
            if(temp % 10 != 0 && (n % (temp % 10)) == 0){
                count++;
            }
            temp /= 10;
        }
        return count;
    }
}
