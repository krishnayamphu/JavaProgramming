package aptech.loop;

public class ForEach {
    /**
     * for(data_type variable : array_name){
     * //code to be executed
     * }
     */

    public static void main(String[] args) {
        int num[]={10,11,12,13,14,15};

       /* for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }*/

        for(int n:num){
            System.out.print(n+" ");
        }

        String employees[]={"ram","hari","sita","gita"};
        System.out.println("");
        for(String emp:employees){
            System.out.print(emp+" ");
        }



    }
}
