@FunctionalInterface
interface func{
    public void m1();
}
class newp extends phone_{
    @Override
    public void greet() {
        System.out.println("Connecting Ghost...");
    }
    @Deprecated
    public int com(int a, int b){
        return a+b;
    }
}
public class javaannotations {
    @SuppressWarnings("Deprecation")
    public static void main(String[] args) {

        newp p = new newp();
        p.greet();
        p.com(5,6);

    }
}
