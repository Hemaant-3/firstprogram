class Employees{
    int sallary;
    String name;
    public int getSallary() {
        return sallary;
    }
    public String getName(){
        return name;
    }
    public void setName(String a){
        name = a;
     }
}
class square{
    int side;
    public void perimeter(){
        System.out.println("The perimeter of square is: "+ 4*side);
    }
    public void area(){
        System.out.println("The area of square is: "+ side*side);
    }
}
class phone {
    public void ring() {
        System.out.println("The phone is ringing.........");
    }

    public void vibrating() {
        System.out.println("Phone is vibrating");
    }

    public void calling() {
        System.out.println("calling to friend");
    }
}
public class opps_praticeset {
    public static void main(String[] args) {
//        Employees hemant = new Employees();
//        hemant.sallary = 1200;
//        hemant.setName("Hemant");
//        System.out.println( hemant.getName());
//        System.out.println(hemant.getSallary());
//        phone oppo = new phone();
//        oppo.calling();
//        oppo.vibrating();
//        oppo.ring();
        square sq1 = new square();
        sq1.side = 12;
        sq1.perimeter();
        sq1.area();
    }
}
