import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {

    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int diagonalFirst = 0;
        int diagonalSecond = 0;

        for (int i = 0; i < arr.size(); i++) {
            diagonalFirst += arr.get(i).get(i);
            diagonalSecond += arr.get(i).get(arr.size() - i - 1);
        }

        return Math.abs(diagonalFirst - diagonalSecond);
    }
}
