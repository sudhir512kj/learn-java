package dateAndTimeApi;

import java.time.*;

public class MoreTimeClasses {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);

        OffsetDateTime odt = OffsetDateTime.now();
        System.out.println(odt);

        ZonedDateTime zdt2 = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(zdt2);

        Period p1 = Period.of(2, 2, 10);
        System.out.println(p1.addTo(LocalDateTime.now()));

        Instant instant = Instant.now();
        System.out.println(instant);
    }
}
