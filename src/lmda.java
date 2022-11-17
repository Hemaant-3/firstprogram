interface demoano {
    public void meth1(int a);
//    public void meth2();
}

//class hemat implements demoano{
//    @Override
//    public void meth1() {
//        System.out.println("I'm the hemat method1");
//    }
//}
//class ano implements demoano{
//    public void meth1(){
//        System.out.println("This is meth1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("This is meth2");
//    }
//
//}
public class lmda {
    public static void main(String[] args) {
        // this is normal method to implements the class and objects
//        ano obj = new ano();
//        obj.meth1();
//        // this is lambda method to implements the methods
//        //Anonymous class
//        demoano obj1 = new demoano() {
//            @Override
//            public void meth1() {
//                System.out.println("This is meth1");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("This is meth2");
//            }
//        };
//        obj1.meth1();
        // lambda expression
// this is work for only finctional_interfaces(only one method implementations)
//        demoano he = new hemat();
//        he.meth1();
        demoano obj3 = (a) -> {
            System.out.println("This is meth1 "+a);
        };
        obj3.meth1(3);
    }
}
