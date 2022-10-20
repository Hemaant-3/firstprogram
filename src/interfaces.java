interface bicycle{
    int a = 45;
    void applybrake(int decrement);
    void speedup(int increment);
}
interface ebicycle{
    void blowhornmhn();
    void blowhornk3g();
}
class avoncycle implements bicycle,ebicycle{
    void blowhorn(){
        System.out.println("pee poo pee");
    }
    public void applybrake(int decrement){
        System.out.println("applying Brake");
    }
    public void speedup(int increment){
        System.out.println("Speeding up");
    }
 public void blowhornmhn(){
     System.out.println("pee poo pee pee pee");
 }
 public void blowhornk3g(){
     System.out.println("peeeeee peeeeeee peeeeee peeeee");
 }

}
public class interfaces {
    public static void main(String[] args) {
    avoncycle Hemant = new avoncycle();
    Hemant.applybrake(4);
    Hemant.speedup(45);
    //You can create properties in interfaces
//        System.out.println(Hemant.a);
        // you can't modified properties in interface as they are final
//        Hemant.a = 90;
        Hemant.blowhornk3g();
        Hemant.blowhornmhn();
    }
}
