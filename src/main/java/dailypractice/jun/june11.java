package dailypractice.jun;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class june11 {
    public static void main(String[] args) {
        SimpleDateFormat DATE_TIME_FORMATTER = new SimpleDateFormat("YYYY-MM-dd'T'HH:mm:ss'Z'");
        DATE_TIME_FORMATTER.setTimeZone(TimeZone.getTimeZone("UTC"));
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        System.out.println(DATE_TIME_FORMATTER.format(calendar));
    }
}
