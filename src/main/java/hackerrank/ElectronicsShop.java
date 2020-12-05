package hackerrank;

public class ElectronicsShop {
    public static void main(String[] args) {
        System.out.println(getMoneySpent(new int[]{5}, new int[]{4}, 5));
    }

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int max = -1;
        for (int keyboard : keyboards) {
            for (int drive : drives) {
                int result = keyboard + drive;
                if (result <= b && max < result) {
                    max = result;
                }
            }
        }
        return max;
    }
}
