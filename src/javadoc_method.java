public class javadoc_method {
    /**
     * this is the main class methods to use the run the program.
     * @param args This needs to be supplied the arguments
     */
    public static void main(String[] args) {

    }

    /**
     * This is simple method for addition
     * @param a Argument a is integer type
     * @param b Argument b is integer type need to supply
     * @return return the integer of a
     * @throws Exception gives exception
     * @deprecated this method not in use, plz use + operator
     */
    public int addd(int a, int b) throws Exception{
        if (a==0){
            throw  new Exception();
        }
        int c;
        c = a+b;
        return c;
    }
}
