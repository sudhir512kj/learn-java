package dateAndTimeApi;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CalendarDemo {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();

        System.out.println(gc.isLeapYear(2025));
        System.out.println(gc.get(Calendar.DATE));
        System.out.println(gc.get(Calendar.MONTH));
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));
        System.out.println(gc.get(Calendar.DAY_OF_YEAR));

        TimeZone tz = gc.getTimeZone();

        System.out.println(tz);
        System.out.println(tz.getDisplayName());
        System.out.println(tz.getID());
    }
}
