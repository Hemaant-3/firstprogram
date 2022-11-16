import java.sql.SQLOutput;
import java.util.*;
public class Array_deque_ {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(5);
        ad1.add(4);
        ad1.add(7);
        ad1.addLast(678);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}
