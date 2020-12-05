package hackerrank;

public class SherlockAndSquares {
    public static void main(String[] args) {
        System.out.println(squares(17, 24));
    }

    static int squares(int a, int b) {
        int s_a = (int) Math.ceil(Math.sqrt(a));
        int s_b = (int) Math.floor(Math.sqrt(b));
        return s_b - s_a + 1;
    }
}
