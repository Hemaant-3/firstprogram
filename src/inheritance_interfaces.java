interface sampleInterface{
    void method1();
    void method2();
}
interface childofinterface extends sampleInterface{
    void method3();
    void method4();
}
class mysample implements childofinterface{
    public void method1(){
        System.out.println("This is method one");
    }
    public void method2(){
        System.out.println("This is method two");
    }
    public void method3(){
        System.out.println("This is method three");
    }
    public void method4(){
        System.out.println("This is method four");
    }
}

public class inheritance_interfaces {
    public static void main(String[] args) {
    mysample s = new mysample();
        s.method1();
        s.method2();
        s.method3();
        s.method4();
    }
}
