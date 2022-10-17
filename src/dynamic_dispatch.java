class phone_ {

    public void greet() {
        System.out.println("Connecting people...");
    }
    public void on() {
        System.out.println("Phone is turning on...");
    }
}
    class smartphone extends phone_ {
        public void on() {
            System.out.println("smartphone is turning on...");
        }

        public void say() {
            System.out.println("Namaste");
        }
    }



public class dynamic_dispatch {
    public static void main(String[] args) {
        phone_ samsung = new smartphone();
       samsung.greet();
       samsung.on();
//       samsung.say() // not allowed
//        smartphone lava = new phone_(); // not allowed

    }
}
