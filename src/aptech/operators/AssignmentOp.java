package aptech.operators;

public class AssignmentOp {
    public static void main(String[] args) {
        /**
         * +=,-=,*=,/=,%=
         */

        int a=5,b=10,c=15,d=20,e=10;
        a+=4; // a=a+4 =5+4 =9
        b-=5; //b=b-5 =10-5 =5
        c*=3; // c=c*3 =15*3 =45
        d/=2; // d=d/2 =20/2 =10
        e%=5; // e=e%5 =10%5 =0

        System.out.println(a); //9
        System.out.println(b); //5
        System.out.println(c); //45
        System.out.println(d); //10
        System.out.println(e); //0
    }

}
