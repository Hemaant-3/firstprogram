import java.util.*;

public class collection_frame {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(23);
        l2.add(73);
        l2.add(53);
        l1.add(5);
        l1.add(4);
        l1.add(7);
        l1.add(5);
        l1.add(2);
        l1.add(0, 9);
//        l1.addAll(l2);
//        l1.addAll(0, l2); // adding a new list to the existing list
        System.out.println(l1.contains(7));
        System.out.println(l1.indexOf(5));
        System.out.println(l1.lastIndexOf(5)); // search from end of list
        l1.set(2,56); //adding the new element at given index.

        for (int i : l1) {

            System.out.print(i);
            System.out.print(", ");
        }
    }
}
