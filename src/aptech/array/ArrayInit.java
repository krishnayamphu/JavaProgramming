package aptech.array;

public class ArrayInit {
    /**
     * Array initialization:
     * type[] intArray = new type[]{ value1,value2,...valuen };
     * or
     * type[] intArray={ value1,value2,...valuen };
     */

    public static void main(String[] args) {
        //int num[]
        //int[] num
        //int []num
        int num[]={10,20,30,40,50};
        String[] emp={"Ram","Hari","Mohan"};

        for(int n:num){
            System.out.print(n+" ");
        }
        System.out.println("");
        for(String e:emp){
            System.out.print(e+" ");
        }
    }
}
