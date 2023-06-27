import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateAndTime {
    public static void main(String[] args) {

    }
    public static String findDay(int month, int day, int year) {
        Calendar cal =  Calendar.getInstance();
        month = cal.get(Calendar.MONTH);
        day = cal.get(Calendar.DAY_OF_MONTH);
        year = cal.get(Calendar.YEAR);

        String[] strArr = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        return (strArr.toString().toUpperCase());

    }
}
