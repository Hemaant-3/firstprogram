public class cwh33 {
// static int sum(int a, int b){
//     return  a+b;
// }
// static int sum(int a, int b, int c){
//     return a+b+c;
// }
// static int sum(int a, int b, int c, int d){
//     return  a+b+c+d;
// }
 // variable arguments
    static int sum(int ...arr){
// available as int [] arr;
        int result = 0;
        for (int a :
                arr) {
            result += a;
        }
        return result;
    }
    // with atleast one argument is required
    static int sum1(int x,int ...arr){
// available as int [] arr;
        int result = x;
        for (int a :
                arr) {
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
//        System.out.println(" The sum of 4 and 6 is: "+sum(4,6));
//        System.out.println("The sum of 4,5 and 6 is: "+sum(4,5,6));
//        System.out.println("The sum of 4,5,6 and 7 is: "+sum(4,5,6,7));
        System.out.println(sum(4,5,6,7,8,9,34,54)); // it return all the sum
        System.out.println("THe sum of nothing is: "+sum());
        System.out.println(sum1(4,76,87,23,67));

    }
}
