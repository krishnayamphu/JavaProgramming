package aptech.array;

public class MultiDimensionalArray {
    /**
     * type[][] array_var = new type[row_size][col_size]; //a 2D array or matrix
     */

    public static void main(String[] args) {

        int[][] num=new int[2][2];
        num[0][0]=100;
        num[0][1]=200;
        num[1][0]=300;
        num[1][1]=400;

        System.out.println(num[0][0]);
        System.out.println("========================");
        for(int i=0;i<2; i++){
            for(int j=0;j<2; j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }


    }

}