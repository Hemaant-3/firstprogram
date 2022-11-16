class MyNewThr3 extends Thread{
    public void run(){
        int i = 0;
        while(true){
//            System.out.println("I am a thread");
            System.out.println("Thank you:****** ");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
class MyNewthe1 extends Thread {
        int i = 0;
    public void run() {
        while (true) {
            System.out.println("My Thank you:#$##### " + getId());

        }
    }
}
public class threads_methods {
    public static void main(String[] args) {
    MyNewThr3 t1 = new MyNewThr3();
    MyNewthe1 t2  = new MyNewthe1();
    // using join methods to run the 2nd threads after first ccompeleltion
t1.start();
        t2.start();
//    try{
//        t2.join();
//
//    } catch (Exception e)
//    {
//        System.out.println(e);
//    }
//        t1.start();
    }
}
