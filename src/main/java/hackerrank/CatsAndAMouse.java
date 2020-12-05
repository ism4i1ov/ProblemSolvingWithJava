package hackerrank;

public class CatsAndAMouse {
    public static void main(String[] args) {

    }

    static String catAndMouse(int x, int y, int z) {
        int catA = Math.abs(x - z);
        int catB = Math.abs(y - z);

        if (catA == catB) return "Mouse C";
        else if (catA < catB) return "Cat A";
        else return "Cat B";
    }
}
