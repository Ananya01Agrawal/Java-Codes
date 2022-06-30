public class op_03_precedence_ {
    public static void main(String[] args) {
        //int a = 6 * 5 - 34 / 2;
        /*
        highest precedence goes to * and /.they are then evaluated
        to the basis of the4 associativity.
        =30-34/2
        =30-17
        =13
         */
        //int b = 60 / 5 - 34 * 2;
        /*
        =12-34*2
        =12-68
        =-56
         */
        //System.out.println(a);
        //System.out.println(b);
        //precedence and associativity
        //Quick quiz
        int b = 0;
        int c = 0;
        int a = 10;
        //int k=x*y/2;
        int k = b * b - (4 * a * c) / (2 * a);
        System.out.println(k);
    }
}
