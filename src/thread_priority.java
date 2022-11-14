class Mythe extends Thread {
    public Mythe(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Thank you: " + getId());
        }
    }
}

public class thread_priority {
    public static void main(String[] args) {
        Mythe t1 = new Mythe("M1");
        Mythe t2 = new Mythe("M2");
        Mythe t3 = new Mythe("M3");
        Mythe t4 = new Mythe("M4");
        Mythe t5 = new Mythe("M5");
        // setting up priorities
        t5.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
