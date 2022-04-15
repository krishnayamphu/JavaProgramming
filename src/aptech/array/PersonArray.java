package aptech.array;
class Person{
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class PersonArray {
    public static void main(String[] args) {
        Person[] p =new Person[5];

        p[0]=new Person("Ram",20);
        p[1]=new Person("Hari",27);
        p[2]=new Person("Gita",45);
        p[3]=new Person("Tina",36);
        p[4]=new Person("Syam",25);

       /*
        p[0].name="Ram";
        p[0].age=20;
        p[1].name="Hari"; p[1].age=30;
        p[2].name="Mohan"; p[2].age=40;
        p[3].name="Bikash"; p[3].age=50;
        p[4].name="Amar"; p[4].age=60;
        */

        for(Person person:p){
            System.out.println(person.name+" "+ person.age);
        }
        System.out.println("=================");
        for(int i=0; i<p.length; i++){
            System.out.println(p[i].name+" "+p[i].age);
        }


    }
}
