class NegativeRadius extends Exception {
    @Override
    public String toString() {
        return "Negative radius not possible";
    }

    @Override
    public String getMessage() {
        return "Negative radius....";
    }
}

public class Throws_throw {
    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static double area(double r) throws NegativeRadius {
        if (r < 0) {
            throw new NegativeRadius();
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static void main(String[] args) {

        try {
            int z = divide(4, 0);
            System.out.println(z);

//            double ar = area(6);
//            System.out.println(ar);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
