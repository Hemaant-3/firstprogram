public class cwh_09_chp2_operatorprecendence {
    public static void main(String[] args) {
        // same as what you read in data structure
        // left to right asso.
        int e;
        int d = e = 45; // Right to left asso.
        // ++, = -> L to R assoc.
        // b^2 - 4ac /2
        int a, b, c;
        a = 3;
        b = 3;
        c = 9;
        int root = ((b ^ 2) - (4 * a * c)) / (2*a);
        System.out.println(root);

    }
}
