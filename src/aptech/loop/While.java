package aptech.loop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class While {
    /**
     * while (condition){
     * //code to be executed
     * Increment/decrement statement
     * }
     */
    public static void main(String[] args) {
        int i=1;
        while (i<=5){
            System.out.println(i);
            i++;
        }

        List<String> students=new ArrayList<>();
        students.add("Ram");
        students.add("sita");
        students.add("hari");
        students.add("mohan");
        Iterator iterator=students.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(String name:students){
            System.out.println(name);
        }
    }
}
