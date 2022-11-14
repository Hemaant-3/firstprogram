class runnableThread1 implements Runnable{
    public void run(){
        int i =0;
        while(i<100){
            System.out.println("Thread1111111");
            i++;
        }
    }
}
class runnableThread2 implements Runnable{
    public void run(){
        int i =0;
        while(i<100){
            System.out.println("Thread22222222");
            i++;
        }
    }
}
public class runnable_thread {
    public static void main(String[] args) {
    runnableThread1 bullet1 = new runnableThread1();
    Thread gun1 = new Thread(bullet1);
    runnableThread2 bullet2 = new runnableThread2();
    Thread gun2 = new Thread(bullet2);

    gun1.start();
    gun2.start();

    }
}
