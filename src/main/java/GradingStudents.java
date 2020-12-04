import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {
        System.out.println((73 / 5 + 1) * 5);
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> list = new ArrayList<Integer>();
        for (Integer grade : grades) {
            int finalGrade = (grade / 5 + 1) * 5;
            if (grade < 35) {
                list.add(grade);
            } else if (finalGrade - grade < 3) {
                list.add(finalGrade);
            } else {
                list.add(grade);
            }
        }
        return list;
    }
}
