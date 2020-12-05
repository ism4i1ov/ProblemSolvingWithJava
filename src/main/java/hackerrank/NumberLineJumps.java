package hackerrank;

public class NumberLineJumps {
    public static void main(String[] args) {
        System.out.println(kangaroo(43, 2, 70, 2));
    }

    static String kangaroo(int x1, int v1, int x2, int v2) {
        while (!(x2 >= x1 && v2 >= v1)) {
            if (x1 == x2) {
                return "YES";
            }
            if(x2 <= x1 && v1 > v2){
                return "NO";
            }
            x1 += v1;
            x2 += v2;
        }
        return "NO";
    }
}
