import java.util.*;

public class Linklist{
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(4);
        l2.add(73);
        l2.add(53);
        l1.add(5);
        l1.add(4);
        l1.add(7);
        l1.add(5);
        l1.add(2);
        l1.add(0, 9);
        l1.addFirst(124);
        l1.addLast(1234);
        l1.addAll(l2);
        l1.addAll(0, l2); // adding a new list to the existing list
        System.out.println(l1.contains(7));
        System.out.println(l1.indexOf(5));
        System.out.println(l1.lastIndexOf(5)); // search from end of list
      for (int i = 0; i<l1.size();i++){
          System.out.print(l1.get(i));
          System.out.print(", ");
      }
    }
}
