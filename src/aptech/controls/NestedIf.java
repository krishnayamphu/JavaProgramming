package aptech.controls;

public class NestedIf {
    /**
     * if(condition){
     *     if(condtion){
     *         ......
     *     }
     *     ......
     * }
     */

    public static void main(String[] args) {
        double math=90;
        double social=70.6;

        if(math>=35 && social>=35){
            double p=(math+social)/2;
            System.out.println("Result: Pass");
            System.out.println("Percentage: "+p);
            if(p>=80){
                System.out.println("Division: Dist.");
            }else if(p>=60){
                System.out.println("Division: First");
            }else if(p>=45){
                System.out.println("Division: Second");
            }else{
                System.out.println("Division: Third");
            }
        }else{
            System.out.println("Fail");
        }
    }
}
