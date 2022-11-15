import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProgramDate {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2022-10-01");
        LocalDateTime d05 = LocalDateTime.parse("2022-10-01T13:56:10");
        Instant d06 = Instant.parse("2022-10-01T13:56:10Z");
        Instant d07 = Instant.parse("2022-10-01T13:56:10-03:00");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        LocalDate d08 = LocalDate.parse("01/10/2022", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("01/10/2022 14:05", fmt2);

        LocalDate d10 = LocalDate.of(2022, 10, 1);
        LocalDateTime d11 = LocalDateTime.of(2022, 10, 1, 14, 5);

        System.out.println("Local Date: " + d01);
        System.out.println("Local Date Time: " + d02);
        System.out.println("Instant: " + d03);
        System.out.println("Local Date Parse: " + d04);
        System.out.println("Local Date Time Parse: " + d05);
        System.out.println("Instant Parse: " + d06);
        System.out.println("Instant Parse GMT + 3: " + d07);
        System.out.println("DateTimeFormatter 1: " + d08);
        System.out.println("DateTimeFormatter 2: " + d09);
        System.out.println("Local Date of: " + d10);
        System.out.println("Local Date Time of: " + d11);
    }
}