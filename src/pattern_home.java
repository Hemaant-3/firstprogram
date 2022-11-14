import java.util.Scanner;

public class pattern_home {
    public static void main(String[] args) {

        System.out.println("Enter the row and column");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i<=n; i++){
            for (int j = 0; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k<=i; k++){
                System.out.print("*");
            }
            // highjh
        for (int k = 0; k<=i; k++){
                System.out.print("*");
            }

            System.out.println();
            }

        // mirror logics
        for (int i = n; i >= 0; i--) {
            for (int k = n; k>=i; k--){
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = i; k>=0; k--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

