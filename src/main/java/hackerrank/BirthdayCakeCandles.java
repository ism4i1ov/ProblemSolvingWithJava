package hackerrank;

import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {
    public static void main(String[] args) {

    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        int count = 1;
        Collections.sort(candles);
        int firstElement = candles.get(0);
        int maxValue = candles.get(candles.size() - 1);
        if(firstElement == maxValue){
            return candles.size();
        }
        for (int i = candles.size() - 2; i > 0; i--) {
            if (candles.get(i) != maxValue) {
                break;
            }
            count++;
        }
        return count;
    }
}
