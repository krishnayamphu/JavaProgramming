package aptech.oops;

public class MyApp {
    public static void main(String[] args) {
        Animal cat=new Animal();
        cat.color="white";
        cat.legs=4;

        Animal crow=new Animal();
        crow.color="black";
        crow.legs=2;

        System.out.println("Cat color:"+cat.color);
        System.out.println("no. of legs:"+cat.legs);

        System.out.println("=========================");
        System.out.println("Crow color:"+crow.color);
        System.out.println("no. of legs:"+crow.legs);
    }
}
