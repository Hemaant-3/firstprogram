interface Camera1 {
    void takeSnap();

    void recordVideo();

    default void record4k() {
        greet();
        System.out.println("Recording in 4k.... from interface");
    }

    private void greet() {
        System.out.println("Good morning");
    }
}

interface wifi1 {
    String[] getNetworks();

    void connectToNetwork(String network);
}

class mycellphone1 {
    void CallNumber(int number) {
        System.out.println("Calling... " + number);
    }

    void pickCall() {
        System.out.println("Connecting...");
    }
}

class mysmartphone1 extends mycellphone1 implements Camera1, wifi1 {
    public void takeSnap() {
        System.out.println("Taking snap...");
    }

    public void recordVideo() {
        System.out.println("Recording video...");
    }

    public String[] getNetworks() {
        System.out.println("List of getting networks");
        String[] networkList = {"Hemant", "rudra", "prashant"};
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
//    public  void record4k(){
//        System.out.println("Recording in 4k from smartphone"); // overriding the methods
//    }

}

public class polymorphism {
    public static void main(String[] args) {
        Camera1 cam = new mysmartphone1(); // This is a smartphone but, use it as a camera
//        cam.getNetworks(); --> not allowed
    cam.record4k();
    }
}
