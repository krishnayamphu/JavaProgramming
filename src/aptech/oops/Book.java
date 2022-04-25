package aptech.oops;

public class Book {
    /**
     * method declaration:
     * access_modifier type methodName(params_list){
     *     //body statements;
     * }
     *
     * #1: general method
     * access_modifier void methodName(){
     *    //body statements;
     * }
     *
     * #2: method with return type
     * access_modifier type methodName(){
     *     //body statements;
     *     return value;
     * }
     * type var=obj.methodName()
     *
     * #3: method with parameters
     * access_modifier void methodName(type parameter1, type parameter2, ...){
     *     //statements;
     * }
     *
     * obj.methodName(value1, value2, ...)
     *
     * #4: method with return type and parameters
     * access_modifier type methodName( parameters_list){
     *     //statements;
     *     return value;
     * }
     *
     * type var=obj.methodName(arg1, arg2,...)
     */

    public void bookInfo(){
        System.out.println("showing book information");
    }

    public double getBookPrice(){
        return 450;
    }
    public double getDiscount(){
        double discount=(getBookPrice()*10)/100;
        return discount;
    }


    public void getBookDetails(String name,String author){
        System.out.println("Book Title:"+name);
        System.out.println("Book Author:"+author);
    }

    public double calcDiscount(double price, double percentage){
        return (price*percentage)/100;
    }

    public static void main(String[] args) {
        Book book=new Book();
        book.bookInfo();
        double price=book.getBookPrice();

        System.out.println("Book's Price:"+price);
        System.out.println("Discount:"+book.getDiscount());


        book.getBookDetails("Java Programming","ABC");

        new Book().getBookDetails("C programming","ABC");
        new Book().getBookDetails("Python","XYZ");

        double discountAmount=book.calcDiscount(1000,10.8);
        System.out.println("Total discount:"+discountAmount);


    }
}
