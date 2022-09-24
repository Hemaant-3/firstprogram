import java.util.Scanner;
public class Greet {
    public static void main(String[] args) {
        String name;
        System.out.println("What we call to you?");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        // output is
        System.out.print("Hello mr. ");
        System.out.println(name);
    }
}
