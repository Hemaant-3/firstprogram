import java.util.Scanner;

public class Errors_ {
    public static void main(String[] args) {
// logical errors demo
        // write  a program to print prime number between 1 to 10;
        System.out.println(2);
        for( int i = 0; i<5; i++){
            System.out.println(2*i+1); // 9 is not prime number;

        }
        // RunTime error
        int k ;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("The integer part of 1000 divided by k is: "+1000/k);
        // this will not work for string , 0 and symbol input.
    }
}
