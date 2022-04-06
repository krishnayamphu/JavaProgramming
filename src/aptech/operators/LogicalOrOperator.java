package aptech.operators;

public class LogicalOrOperator {
    public static void main(String[] args) {
        /**
         * || => Logical OR
         * C1   C2      OUTPUT (C1+C2)
         * T     T        T     =1+1 =1
         * T     F        T     =1+0 =1
         * F     T        T     =0+1 =1
         * F     F        F     =0+0 =0
         */
        String name="ABC";
        String address="ktm";
        System.out.println(name=="abc" || name=="ABC"); //true
        System.out.println(name=="abc" || address=="ktm"); //true
        System.out.println(name=="ABC" || address=="KTM"); //true
        System.out.println(name=="cdf" || address=="kathmandu"); //false
    }
}
