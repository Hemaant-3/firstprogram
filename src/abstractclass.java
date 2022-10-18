abstract class p1{
    public p1(){
        System.out.println("Hello i'm constructor of parents");
    }
    public void greet(){
        System.out.println("Good morning sir");
    }
    abstract void bolo();
    abstract void kaho();
}
abstract class child2 extends p1{
    public void greet2(){
        System.out.println("Ni hao, hola");
    }
}

class child extends p1{
    @Override
    public void bolo(){
        System.out.println("NAmaste");
    }

    @Override
    void kaho() {
        System.out.println("Namaste!!");
    }
public void hen(){
    System.out.println("Yes it is possible to implement new methods");
}

}
public class abstractclass {
    public static void main(String[] args) {
//p1 parent = new p(); // not possible becoz it's abstract
//    child2 c = new child2(); // not possible because it's abstract;
    child c1 = new child(); // it's possible


    }

}
