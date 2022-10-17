class employee{
    int id;
    int sallary;
    String name;
    public int getSallary(){
        return sallary;
    }
    public void printdetails(){
        System.out.println("My id is "+id);
        System.out.println("and my name is "+name);
    }
}
public class opps_1 {

    public static void main(String[] args) {
        System.out.println(" This is our custom class");
        // initiating a object from class
        employee hemant = new employee();
        employee john = new employee();
        // setting properties/attributes
        hemant.id = 12;
        hemant.name = "Hemant";
        hemant.sallary = 12000;
        john.id = 43;
        john.name = "John tiwari";
        john.sallary = 13000;
        // printing the attributes
//        System.out.println(hemant.id);
//        System.out.println(hemant.name);
//        hemant.printdetails();
//        john.printdetails();
        int z = john.getSallary();
        System.out.println(z);

    }
}
