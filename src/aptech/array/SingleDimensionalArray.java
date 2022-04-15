package aptech.array;

public class SingleDimensionalArray {
    /**
     * One-Dimensional Arrays:
     * type var-name[];
     * OR
     * type[] var-name;
     *
     * Assigning array value:
     * array_var[index]=value
     */

    public static void main(String[] args) {
        //array declaration
        int num[] =new int[5];
        num[0]=100;
        num[1]=200;
        num[2]=300;
        num[3]=400;
        num[4]=500;

        System.out.println(num[3]);
        System.out.println("------------------");
        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }

        System.out.println("------------------");
        for(int n:num){
            System.out.println(n);
        }


    }
}
