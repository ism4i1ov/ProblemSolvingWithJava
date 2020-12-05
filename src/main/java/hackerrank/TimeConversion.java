package hackerrank;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {
    public static void main(String[] args) {

    }

    static String timeConversion(String s) {
        String newTime = s.substring(0,s.length()-2) + " " + s.charAt(s.length()-2) + s.charAt(s.length()-1);
        DateFormat df = new SimpleDateFormat("hh:mm:ss aa");
        DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
        Date date;
        String output = null;
        try{
            date= df.parse(newTime);
            output = outputformat.format(date);
        }catch(ParseException pe){
            pe.printStackTrace();
        }
        return output;
    }
}
