package aptech.loop;

public class LabelInFor {
    /**
     * labelname:
     *
     *
     * break labelname;
     */
    public static void main(String[] args) {
        outer:
        for(int i=1; i<=5; i++){
            inner:
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
                if(i==3 && j==3){
                    break outer;
                }
            }
            System.out.println("");
        }
    }
}
