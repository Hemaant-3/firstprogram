
class C1 {
    public int x = 5;
    protected int y = 45;
    int z = 6;
    private int a = 68;

    public void meth1() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class Aceess_modifier {
    public static void main(String[] args) {
    C1 c = new C1();
//    c.meth1();

    }
}
