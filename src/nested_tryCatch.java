import java.util.Scanner;

public class nested_tryCatch {
    public static void main(String[] args) {
        int[] marks = {6, 56, 28};
        Scanner sc = new Scanner(System.in);
        boolean flag =true;
        while (flag) {
            System.out.println("Enter the array index: ");
            int ind = sc.nextInt();

            try {
                System.out.println("Welcome to Java: ");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index doesn't exist!!");
                    System.out.println("Exception level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception level 1 ");
            }
        }
        System.out.println("Thanks for using the program!!!!!!");
    }
}