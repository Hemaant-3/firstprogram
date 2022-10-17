class animals{
    String name;
    public int leg;
    public int eye;
    public int eare;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public int getEye() {
        return eye;
    }

    public void setEye(int eye) {
        this.eye = eye;
    }

    public int getEare() {
        return eare;
    }

    public void setEare(int eare) {
        this.eare = eare;
    }

    public void walk(){
        System.out.println("Walking...");
    }
    public void eat(){
        System.out.println("Eating....");
    }
    public void discharge(){
        System.out.println("popping....");
    }
}
class dog extends animals{
    public void bark(){
        System.out.println("bho,..bhoo..bhoo...bhooooo");
    }
}
public class quizes {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.setEare(2);
        d1.setEye(2);
        d1.setLeg(4);
        d1.setName("Husky");
        d1.bark();

    }
}
