class Mythread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (true) {
            System.out.println("Cooking the food");
            System.out.println("****************");
            i++;
        }
    }
}

    class Mythread2 extends Thread {
        @Override
        public void run() {
            int i = 0;
            while (true) {
                System.out.println("I'm Chatting....");
                System.out.println("###########");
                i++;
            }
        }
    }



public class thread {
    public static void main(String[] args) {
    Mythread1 t1 = new Mythread1();
    Mythread2 t2 = new Mythread2();
    t2.start();
    t1.start();
    }
}
