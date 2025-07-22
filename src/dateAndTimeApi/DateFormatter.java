package dateAndTimeApi;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class DateFormatter {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");

        System.out.println(dtf.format(localDateTime));

        ZonedDateTime zdt = ZonedDateTime.now();

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss z Z");

        System.out.println(dtf2.format(zdt));

        System.out.println(localDateTime.get(ChronoField.DAY_OF_MONTH));
    }
}
