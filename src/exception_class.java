import java.util.Scanner;

class exception1 extends Exception {
    @Override
    public String toString() {
        return "I'm toString";
    }

    @Override
    public String getMessage() {
        return "I'm get message";
    }
}
class MaxageException extends Exception {
    @Override
    public String toString() {
        return "Age can't be greater than 125";
    }

    @Override
    public String getMessage() {
        return "Please mention the right age";
    }
}
public class exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        a = sc.nextInt();
        if (a<9){
            try {
                throw new exception1();
//                throw new ArithmeticException("This is airthmatic exception: ");
//                throw  new ArrayStoreException("This is array");
            } catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace(); // it does not an error
            }
        }
        System.out.println("End of code");
    }
}
