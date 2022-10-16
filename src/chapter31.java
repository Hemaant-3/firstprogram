public class chapter31 {
    static int logic(int x, int y){
        int z;
        if (x>y){
            z = x+y;
        }else {
            z = x*y;
        }
        return  z;
    }
    int logic_obj(int x, int y){
        int z;
        if (x>y){
            z = x+y;
        }else {
            z = x*y;
        }
        return  z;
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int c;
        c = logic(a,b);
        int c2 = logic(6,5);
        System.out.println(c);
        System.out.println(c2);
// method invocation using object creation
        chapter31 obj = new chapter31(); // creating an object
        int v = obj.logic_obj(9,4);
        System.out.println(v);


    }
}
