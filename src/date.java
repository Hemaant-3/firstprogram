import java.util.Date;

public class date {
    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis()); // counting since 1 january 1970
//        System.out.println(System.currentTimeMillis()/1000/3600/24/365); // counting since 1 january 1970
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(System.currentTimeMillis());
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());// depreciated
        System.out.println(d.getDay()); // depreciated
        System.out.println(d.toString());

    }
}
