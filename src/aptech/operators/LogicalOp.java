package aptech.operators;

public class LogicalOp {
    public static void main(String[] args) {
        /**
         * && => Logical AND
         * C1   C2      OUTPUT (C1*C2)
         * T(1)     T        T  =1X1 =1
         * T     F (0)        F =1X0 =0
         * F     T        F     =0X1 =0
         * F     F        F     =0X 0=0
         */

        int a=5, b=6, c=7;

        System.out.println(c>a && c>b); //true
        System.out.println(c>a && b>c); // false
        System.out.println(a>b && c>b); // false
        System.out.println(a>b && a>c);  //false


    }
}
