package dateAndTimeApi;

import java.time.*;
import java.util.Date;

public class JodaDateAndTimeAPI {
    public static void main(String[] args) {
        Date d = new Date();
        d.setHours(21);
        System.out.println(d);

        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalDate ld2 = LocalDate.now(Clock.systemDefaultZone());
        System.out.println(ld2);

        LocalDate ld3 = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(ld3);

        LocalDate ld4 = LocalDate.of(2020, Month.MARCH, 23);
        System.out.println(ld4);

        LocalDate ld5 = LocalDate.ofEpochDay(1000);
        System.out.println(ld5);

        LocalDate ld6 = LocalDate.parse("2020-01-03");
        System.out.println(ld6);

        LocalDate ld7 = ld.plusMonths(3);
        System.out.println(ld7);

        LocalTime lt1 = LocalTime.now();
        System.out.println(lt1);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
    }
}
