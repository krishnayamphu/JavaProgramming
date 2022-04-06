package aptech.controls;

public class IfElseIf {
    /**
     * 3. if else if condition
     *
     * if(condition){
     *      //statements (true)
     * }
     * else if(condition){
     *      //statements (true)
     * }
     * ....
     * else if(condition){
     *     //statements
     * }
     * else{
     *     //statements
     * }
     */
    public static void main(String[] args) {
        int remarks=30;
        if(remarks>=80){
            System.out.println("Excellent");
        }else if(remarks>=70){
            System.out.println("Very Good");
        }else if(remarks>=60){
            System.out.println("Good");
        }else if(remarks>=50){
            System.out.println("Fair");
        }else if(remarks>=40){
            System.out.println("Satisfactory");
        }else{
            System.out.println("Poor");
        }

    }
}
