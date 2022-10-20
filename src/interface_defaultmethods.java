interface Camera {
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

interface wifi {
    String[] getNetworks();

    void connectToNetwork(String network);
}

class mycellphone {
    void CallNumber(int number) {
        System.out.println("Calling... " + number);
    }

    void pickCall() {
        System.out.println("Connecting...");
    }
}

class mysmartphone extends mycellphone implements Camera, wifi {
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

public class interface_defaultmethods {
    public static void main(String[] args) {
        mysmartphone ms = new mysmartphone();
        String[] ar = ms.getNetworks();
        for (String item : ar) {
            System.out.println(item);
        }
//        ms.record4k(); // calling interface definition
        // on overriding methods it call the record4k from smartphone class.
    }
}
