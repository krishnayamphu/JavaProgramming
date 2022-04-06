package aptech.operators;

public class TenaryOp {
    public static void main(String[] args) {
        /**
         *  expression ? value_if_true : value_if_false;
         */
        int a=10, b=5;
        System.out.println(a>b?a:b); //10
        System.out.println(a>b? "a is greater":"b is greater");
    }
}
