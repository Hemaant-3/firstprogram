class base {
    int x;

    public void setX(int x) {
        System.out.println("I'm in Base class setting the value of x");
        this.x = x;
    }

    public int getx() {
        return x;
    }

    public void printme() {
        System.out.println("I'm constructor");
    }
}

class derived extends base {
    int y;
    derived(){
        System.out.println("This is me");
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // performing on base class
        base b1 = new base();
        b1.setX(45);
        System.out.println(b1.x);
        // performing on derived class
        derived d = new derived();
        d.setX(54);
        d.setY(56);
        System.out.println(d.getx());
        System.out.println(d.getY());
    }
}
