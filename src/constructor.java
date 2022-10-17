class Memployee{
    private int id;
    private String name;
    public void setName(String n){name = n;}
    public void setId(int i){id=i;}
    public String getName(){return name;}
    public int getId(){return id;}
    public Memployee(){
        id = 0;
        name = "Your_name_here";
    }
    public Memployee(int i){
        id = i;
        name = "Monu";
    }
    public Memployee(int z,String nm){
        id = z; name = nm;}
}
public class constructor {
    public static void main(String[] args) {
//        Memployee Hemant = new Memployee();
        Memployee Hemant = new Memployee(123,"HEmant");
        System.out.println(Hemant.getId());
        System.out.println(Hemant.getName());
    }
}
