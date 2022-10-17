class cyliander{
   private int height;
    private int radius;

    public cyliander(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }
public double surfaceArea(){
        return 2*Math.PI * radius *radius + 2*3.142*radius*height;
}
public double volume(){
        return Math.PI * radius* radius*height;
}
    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
public class exercise4 {

    public static void main(String[] args) {
    cyliander mycilander = new cyliander(12,9);
//    mycilander.setHeight(12);
//    mycilander.setRadius(9);
//        System.out.println(mycilander.getHeight());
//        System.out.println(mycilander.getRadius());
        System.out.println(mycilander.surfaceArea());
        System.out.println(mycilander.volume());

    }
}
