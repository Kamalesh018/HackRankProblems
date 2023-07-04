import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateAndTime {
    public static void main(String[] args) {

    }
    public static String findDay(int month, int day, int year) {

        Calendar cal = Calendar.getInstance();
        cal.set(year,month-1,day);
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        return sdf.format(cal.getTime()).toUpperCase();

    }
}
