import java.util.Scanner;
public class Marks_cali {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the max marks");

        float total_marks = sc.nextFloat();
        System.out.println("enter the marks of subject 1");
        float sub_1 = sc.nextFloat();
        System.out.println("enter the marks of subject 2");
        float sub_2 = sc.nextFloat();
        System.out.println("enter the marks of subject 3");
        float sub_3 = sc.nextFloat();
        System.out.println("enter the marks of sub 4");
        float sub_4 = sc.nextFloat();
        System.out.println("Enter the marks of sub 5");
        float sub_5 = sc.nextFloat();
        float sum = sub_1  + sub_2 + sub_3 + sub_4 + sub_5;
        float per = (sum/total_marks * 100);
        System.out.print("The percentage is: ");
        System.out.println(per);


    }
}
