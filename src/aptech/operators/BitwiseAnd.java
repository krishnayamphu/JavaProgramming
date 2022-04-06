package aptech.operators;

public class BitwiseAnd {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        int c=15;

        System.out.println(a>b && a++>c); //false
        System.out.println(a);  //5

        System.out.println(a>b & a++>c); //false
        System.out.println(a); //6
    }
}
