public class finally_block {
    public static int greet(){
        try {
            int a = 40;
            int b = 20;
            int c = a/b;
            return c; /// program should return if this block is executed.
        } catch (Exception e){
            System.out.println(e);
        }
        finally {
            // Any how this block of code is executed everytime calls
            System.out.println("This is finally.. cleaning up resources......");
        }
        return -1; // if exception occur then -1 is return.
    }
    public static void main(String[] args) {
//    int k = greet();
//        System.out.println(k);
        int a = 50;
        int b = 8;
        while (true){
            try {
                int c = a/b;
                System.out.println(c);
            } catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("THis is finally block.. Thank you so much!! "+b);
            }
            b--;
        }
        try {
            System.out.println(50/50);
        } finally {
            System.out.println("THis is finally block 2");
        }
    }
}
