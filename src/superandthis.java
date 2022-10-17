class ekclass{
    int a;
    ekclass(int a){
        this.a = a;
    }
    public int returnone(){
        return 1;
    }
}
class doclass extends ekclass{
    doclass(int c){
        super(c);
        System.out.println("I'm do constructor");
    }
}
public class superandthis {
    public static void main(String[] args) {
//ekclass e = new ekclass(66);
doclass d = new doclass(7);
    }
}
