import java.util.Scanner;
public class KmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number in Kilometers: ");
        double km = sc.nextFloat();
        double mile = km * 1.602;
        System.out.print(mile);
        System.out.print(" mile ");

    }
}
