package hackerrank;

public class BreakingTheRecords {
    public static void main(String[] args) {

    }

    static int[] breakingRecords(int[] scores) {
        int[] returnArr = new int[2];

        int max = scores[0];
        int min = scores[0];

        int highestScoreCount = 0;
        int lowerScoreCount = 0;

        for (int i = 0; i < scores.length - 1; i++) {
            if(scores[i] > scores[i + 1] && !(min < scores[i + 1]) && (min != scores[i+1])){
                lowerScoreCount++;
                min = scores[i + 1];
            }else if(scores[i] < scores[i + 1] && !(max > scores[i + 1]) && max != scores[i+1]){
                highestScoreCount++;
                max = scores[i + 1];
            }
        }

        returnArr[0] = highestScoreCount;
        returnArr[1] = lowerScoreCount;
        return returnArr;
    }
}
