package aptech.controls;

public class SwitchCase {
    /**
     * switch(expression)
     * {
     *     case 1:
     *     //statements
     *     break;
     *     case 2:
     *     //statements
     *     break;
     *     case n:
     *     //statements
     *     break;
     *     default:
     *     //statements;
     *     break;
     * }
     */
    public static void main(String[] args) {
        int day=50;
        switch (day){
            case 1:
                System.out.println("sun"); break;
            case 2:
                System.out.println("mon"); break;
            case 3:
                System.out.println("tue"); break;
            case 4:
                System.out.println("wed"); break;
            case 5:
                System.out.println("thu"); break;
            case 6:
                System.out.println("fri"); break;
            case 7:
                System.out.println("sat"); break;
            default:
                System.out.println("Invalid day no."); break;
        }

        // +,-,*,/
        char op='*';
        switch (op){
            case '+':
                System.out.println("addition"); break;
            case '-':
                System.out.println("substraction"); break;
            case '*':
                System.out.println("multiplication"); break;
            case '/':
                System.out.println("divide"); break;
            default:
                System.out.println("Invalid operators");
        }

    }
}
