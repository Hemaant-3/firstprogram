public class praticeset7 {
    // write a java program to print multiplication table of a number n using method
    static void mul_Table(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", a, i, a * i);
        }
    }

    static void pattern(int x) {
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static int sum_recrsive(int a) {
        if (a == 0) {
            return 0;
        } else {
            return a + sum_recrsive(a - 1);
        }
    }

    static int sum_avg(int... a) {
        int sum2 = 0;
        for (int i : a) {
            sum2 += i;
        }
        return sum2 / a.length;
    }
static  void pattern_rec(int n){
        if (n>0){
            pattern_rec(n-1);
            for (int i = 0; i<n;i++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // resolve
    // n=3: patten_rec(2) + print 3 times star
    // n=2: pattern_rec(1) + print 2 times star + print 3 times star
    // n=1: pattrn_rec(0) + print 1 times star + print 2 times star + print 3 times star
}
    public static void main(String[] args) {
//        mul_Table(9);
//    pattern(5);
//        int c = sum_recrsive(5);
////        System.out.println(c);
//        int z = sum_avg(45,67,89,12);
//        System.out.println("The average of 45,67,89,12 is: "+z);
        // prob 8
pattern_rec(5);

    }


}
