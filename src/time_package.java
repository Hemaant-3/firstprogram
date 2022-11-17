import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class time_package {
    public static void main(String[] args) {
//        LocalDate d = LocalDate.now();
//        System.out.println(d);
//
//        LocalTime t = LocalTime.now();
//        System.out.println(t);
        LocalDateTime dt = LocalDateTime.now();
//        System.out.println(dt);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E h:m  a");
        DateTimeFormatter df2 = DateTimeFormatter.ISO_DATE;
        String mydate = dt.format(df);
        String mydate2 = dt.format(df2);
        System.out.println(mydate2);
        System.out.println(mydate);
    }
}
