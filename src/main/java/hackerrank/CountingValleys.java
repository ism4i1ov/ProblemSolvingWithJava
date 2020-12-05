package hackerrank;

public class CountingValleys {
    public static void main(String[] args) {
        System.out.println(countingValleys(8, "UDUUUDUDDD"));
    }

    public static int countingValleys(int steps, String path) {
        int count = 0;
        int valleys = 0;
        for (int i = 0; i < path.length(); i++) {
            count += path.charAt(i) == 'U' ? +1 : -1;
            if(count ==0 && path.charAt(i) == 'U'){
                valleys++;
            }
        }
        return valleys;
    }
}
