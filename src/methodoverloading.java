public class methodoverloading {
    static void tell_joke() {
        System.out.println("Hey i invented a new world, plagarism  ");
    }
static void foo(){
    System.out.println("HELLO, Good morning: ");
}
static void foo(int a){
    System.out.println("HEllo Mr. "+a+" Good morning");
}
static void foo(int a, int b){
    System.out.println("Good morning "+a+" and "+b);
}
    static void change(int[] x) {
        x[0] = 1000;
    }


    public static void main(String[] args) {
//        tell_joke();
//        int [] marks = new int[5]; // array is an object
//       int [] marks = {12,34,21,56,3};
//       change(marks);
//        System.out.println(marks[0]); //  it reflects changes.
//         method overloading
foo();
foo(5000);
foo(100,200);
    }
}
