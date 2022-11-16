public class try_catch {
    public static void main(String[] args) {
        int a = 700;
        int b = 0;
//        int c = a/b;
//        System.out.println(c);
        try {
            int c = a/b;
        System.out.println(c);
        } catch (Exception e){
            System.out.println("We failed to execute program. reason is: ");
            System.out.println(e);
        }
        System.out.println("End of program");
    }
}
