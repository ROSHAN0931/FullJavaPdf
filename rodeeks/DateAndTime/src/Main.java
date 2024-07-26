import java.time.*;
import java.time.format.DateTimeFormatter;

class Main
{
    public static void main(String[] args) {
//        LocalDate d = LocalDate.now();
//        System.out.print("Date : ");
//        System.out.println(d);
//
//        LocalTime t = LocalTime.now();
//        System.out.print("Time : ");
//        System.out.println(t);
//
//        LocalDate leap = LocalDate.of(2023,Month.FEBRUARY,28);
//        System.out.println(leap);
//
//        LocalDate month = LocalDate.of(2024,Month.SEPTEMBER,30);
//        System.out.println(month);
//
//        LocalTime ct = LocalTime.of(10,30,15);
//        System.out.println(ct);
//
//        LocalTime z = LocalTime.now(ZoneId.of("Asia/Singapore"));
//        System.out.println(z);
//
//        Instant i = Instant.now();
//        System.out.println(i);
//        for(String i : ZoneId.getAvailableZoneIds())
//        {
//            System.out.println(i);
//        }

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String format = dt.format(f);
        System.out.println(format);

        LocalDateTime sdt = dt.withDayOfMonth(26).withYear(2016);
        System.out.println(sdt);
    }
}
