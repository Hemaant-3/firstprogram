class A {
    public int a;
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("Iam method 2 of class A");
    }
}
class B extends A{
    public void meth3(){
        System.out.println("I'm method 3 of class B");
    }
    @Override
    public void meth2(){
        System.out.println("I'm method 3 of class B");
    }
}
public class methodoverricing {
    public static void main(String[] args) {
A one = new A();
//one.meth2();
        B two = new B();
        two.meth2();
        two.harry();
    }
}
