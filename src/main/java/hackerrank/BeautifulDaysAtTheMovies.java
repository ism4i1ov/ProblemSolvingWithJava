package hackerrank;

public class BeautifulDaysAtTheMovies {
    public static void main(String[] args) {
        System.out.println(beautifulDays(13,45,3)); ;
    }

    static int beautifulDays(int i, int j, int k) {
        int count = 0;
        for (int l = i; l <= j; l++) {
            StringBuilder sb = new StringBuilder();
            sb.append(l);
            int reverse = Integer.parseInt(sb.reverse().toString());
            if (Math.abs(l - reverse) % k == 0 || l -  reverse == 0) {
                count++;
            }
        }
        return count;
    }
}
