class circle {
    private int radius;
    private double area;
    private double circumference;

    public void setRadius(int r) {
        this.radius = r;
    }

    public void setCircumference(double cir) {
        this.circumference = cir;
    }

    public void setArea(double ar) {
        if (ar == (22 * radius * radius) / 7) {
            area = ar;
        } else {
            System.out.println("Warning!!: as per radius!!!");
        }
    }

}

class myemployee {
    private int id;
    private String name;

    public void setName(String n) {
        name = n;
    }

    public void setId(int z) {
        id = z;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}

public class accessModifier {

    public static void main(String[] args) {
        myemployee hemant = new myemployee();
//        hemant.id = 12; // error throw
//        hemant.name = "Hemant"; // throw an error due to private access modifier
//        hemant.setId(12);
//        hemant.setName("Hemant");
//      int k =  hemant.getId();
//        String h = hemant.getName();
//        System.out.println(k+" "+h);
        circle c1 = new circle();
        c1.setCircumference(31.42);
        c1.setRadius(5);
        c1.setArea(78.54);
    }
}
