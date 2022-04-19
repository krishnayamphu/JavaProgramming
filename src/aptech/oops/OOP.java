package aptech.oops;

/**
 * define a class:
 * modifier class <class_name>{
 *     //members/fields
 *     //methods
 * }
 * create an object:
 * <class_name> <object> = new <class_name>();
 *
 * accessing class properties by an object:
 * ->obj.member
 * ->obj.method()
 */
public class OOP {
    public int n;
    public static void main(String[] args) {
        OOP obj=new OOP();
        obj.n=50;
        System.out.println(obj.n);

    }

}
