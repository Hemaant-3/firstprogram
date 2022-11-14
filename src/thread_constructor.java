class Myth extends Thread{
    public Myth(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thank you");
    }
}
public class thread_constructor {
    public static void main(String[] args) {
    Myth t1 = new Myth("Hemant"); // setting up thread name
        Myth t2 = new Myth("Monu");
        t1.start();
        t2.start();
        System.out.println("The id of thread t1 is: "+t1.getId());
        System.out.println("The id of thread t1 is: "+t1.getName());
        System.out.println("The id of thread t1 is: "+t2.getId());
        System.out.println("The id of thread t1 is: "+t2.getName());
    }
}
