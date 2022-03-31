package aptech.operators;
class Book{
    class Person{}
}

public class RelationalOp {
    public static void main(String[] args) {
        System.out.println(5>4); //true
        System.out.println(4<3); //false
        System.out.println(10>=5); //true
        System.out.println(2==2); //true
        System.out.println(1!=1);//false

        Book b=new Book();

        Book.Person p=b.new Person();

        System.out.println(b instanceof Book); //true
        //System.out.println(p instanceof Book); //false
    }
}
