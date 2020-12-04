public class Staircase {
    public static void main(String[] args) {
        staircase(4);
    }

    static void staircase(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = n; j > i - 1; j--) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
