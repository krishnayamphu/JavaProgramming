package aptech.loop;

public class LoopTermination {
    /**
     * break;
     * continue;
     */
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            System.out.println(i);
            if(i==3){
                break;
            }
        }
        System.out.println("=========================");
        for(int j=1; j<=5; j++){
            if(j==2|| j==4){
                continue;
            }
            System.out.println(j);
        }
    }
}
