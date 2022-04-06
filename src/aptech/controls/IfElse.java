package aptech.controls;

public class IfElse {
    /**
     * 2. if else condition
     *
     * if(condition){
     *     //statements (true)
     * }else{
     *     //statements (false)
     * }
     */
    public static void main(String[] args) {
        double math=30;
        if(math>=45){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

        String username="user";
        String password="a123";
        if(username.equals("admin") && password.equals("a123")){ //true|false
            System.out.println("Welcome admin");
        }else {
            System.out.println("Invalid username or password");
        }

        boolean bool=false;
        if(bool){
            System.out.println("true");
        }else{
            System.out.println("false");
        }



    }
}
