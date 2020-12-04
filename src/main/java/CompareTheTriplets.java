import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {
    public static void main(String[] args) {

    }

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> list = new ArrayList<Integer>();
        int countAlice = 0;
        int countBob = 0;

        for (int i = 0; i < 3; i++) {
            if(a.get(i) > b.get(i)){
                countAlice++;
            }else if(a.get(i) < b.get(i)){
                countBob++;
            }
        }

        list.add(countAlice);
        list.add(countBob);
        return list;
    }
}
