import java.util.Scanner;


public class specific_exception {
    public static void main(String[] args) {
        int[] marks = {6, 56, 28};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index: ");
        int index = sc.nextInt();
        System.out.println("Enter the number to divide the value of array: ");
        int number = sc.nextInt();

        try {
            System.out.println("The value at array index is: " + marks[index]);
            System.out.println("The value of array-value/number is: " + marks[index] / number);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException !!");
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println("AirthmaticException !!");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("some other Exception !!");
            System.out.println(e);
        }
    }
}
