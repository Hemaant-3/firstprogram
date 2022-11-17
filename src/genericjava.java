import java.util.ArrayList;
import java.util.Scanner;
class Mygeneric<T1,T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public Mygeneric(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}

public class genericjava {
    public static void main(String[] args) {
//        ArrayList arrayList = new ArrayList();
//        ArrayList<Integer> arrayList = new ArrayList();
//        arrayList.add(41);
////        arrayList.add("Hemant");
//        arrayList.add(44);
//        arrayList.add(23);
//        arrayList.add(new Scanner(System.in));

//       int a =(int) arrayList.get(1); //it produces run time error.
//       int a = arrayList.get(2);
//        System.out.println(a);
         Mygeneric<String,Integer> g1 = new Mygeneric(23,"This is my string",56);
         String str = g1.getT1();
         int str1 = g1.getT2();
        System.out.println(str1);
        System.out.println(str);
    }
}
