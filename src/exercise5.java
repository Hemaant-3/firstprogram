interface  tvremote{
    void poweron();
    void poweroff();
}
interface smarttvremote extends tvremote{
    void timer();
    void display();
}
class television implements  smarttvremote{
    public void poweron(){
        System.out.println("Turning power on......");
    }
    public void poweroff(){
        System.out.println("turning power off.....");
    }
    public void timer(){
        System.out.println("Setting up timer");
    }
    public void display(){
        System.out.println("display setting");
    }
}
abstract class pen{
     abstract void write();
     abstract void refil();
}
class fountainPen extends pen{
    public void write(){
        System.out.println("Writing with pen");
    }
    public void refil(){
        System.out.println("Refilling the pen");
    }
    void changeNib(){
        System.out.println("changing the nib of pen");
    }
}
interface basicAnimal{
    void eat();
    void sleep();
}
class monkey{
    void jump(){
        System.out.println("jumping on tree");
    }
    void bite(){
        System.out.println("Bitting monkey");
    }
}
class human extends monkey implements basicAnimal{
    @Override
    public void eat() {
        System.out.println("Human is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Human is sleeping");
    }
}
abstract class  telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class newsmartphone extends telephone{
    public void ring(){
        System.out.println("Ringing.....");
    }
    public void lift(){
        System.out.println("Picking up.....");
    }
    public void disconnect(){
        System.out.println("Disconnecting....");
    }
}
public class exercise5 {
    public static void main(String[] args) {
// polymorphism
//        telephone t1 = new newsmartphone();
//        t1.ring();
//        monkey m1 = new human();
//        m1.bite();
    television tv = new television();
    tv.poweron();
    }
}
