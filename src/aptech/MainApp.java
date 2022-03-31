package aptech;

public class MainApp {
    public static void main(String[] args) {
        byte a=10; //-128 to 127
        short b=100; //-32,768 to 32,767
        int c=4560; //  -2,147,483,648 to 2,147,483,647
        //21,47,48,36,47
        //98,00,00,00,00 => go for long datatype

        long l=9800000000L;

        float f=10.5f;
        double d=100.5d;

        char ch='A';
        boolean bool =true;

        System.out.println("byte:"+a);
        System.out.println("long:"+l);
        System.out.println("float:"+f);
        System.out.println("double:"+d);
        System.out.println("char:"+ch);
        System.out.println("boolean:"+bool);
    }
}
