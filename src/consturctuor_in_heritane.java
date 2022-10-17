class base1 {
    base1() {
        System.out.println("I'm base class constructor");
    }

    base1(int x) {
        System.out.println("I'm base constructor with a " + x);
    }
}

class derived1 extends base1 {
    derived1() {
        System.out.println("I'm derived class constructor");
    }

    derived1(int k, int y) {
        super(k); // it passes the argument in parent constructor and call it.
        System.out.printf("I'm derived constructor with %d, %d\n", k, y);
    }
}
class childofderived extends derived1{
    childofderived(){
        System.out.println("I'm childofderived consrtuctor");
    }
    childofderived(int k, int m){
        super(k,m);
        System.out.printf("I'm child of derived class with %d %d\n", k,m);
    }
}
public class consturctuor_in_heritane {
    public static void main(String[] args) {
//        derived1 d1 = new derived1();
//        derived1 d2 = new derived1(2,3);
//        childofderived cd = new childofderived();
        childofderived cd = new childofderived(4,5);
    }
}
