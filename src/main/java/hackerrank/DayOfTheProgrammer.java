package hackerrank;

public class DayOfTheProgrammer {
    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(1800));
    }

    static String dayOfProgrammer(int year) {
        int february = 28;
        if (year == 1918) {
            return "26.09.1918";
        } else if (year == 1800 || year == 1700 || year == 1900) {
            return "12.09." + year;
        } else if ((year % 400 == 0) || ((year % 100) != 0 && (year % 4 == 0))) {
            february = 29;
        }
        int result = 256 - (31 + february + 31 + 30 + 31 + 30 + 31 + 31);
        return result + ".09." + year;
    }
}
