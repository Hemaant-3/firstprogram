import java.util.HashSet;
public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(7);
        myHashSet.add(5);
        myHashSet.add(2);
        myHashSet.add(9);
        myHashSet.add(9);
        System.out.println(myHashSet);
    }
}
