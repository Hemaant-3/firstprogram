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
    static  int fib(int k){
        if(k == 0){
            return 0;
        }
        if(k == 1 || k == 2){
            return 1;
        }
        return fib(k-1)+fib(k-2);
    }
    public static void main(String[] args) {
        System.out.println(fib(9));
        for (int i = 0; i<9; i++ ){
            System.out.print(fib(i)+" ");
        }
    }
}
