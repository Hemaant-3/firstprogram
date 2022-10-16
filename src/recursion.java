public class recursion {
    // factorial(0) = 1
    // factorial(1) = 1
    static int factorial(int x){
        if(x==0 || x==1){
            return  1;
        } else {
            return x * factorial(x-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
