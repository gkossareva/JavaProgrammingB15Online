package day31;

public class Calculator {
    public static void main(String[] args) {
      //  char operator='/';
        //int num1=15;
        //int num2=3;
        calculate('-',30,10);
        calculate('+',20,10);
        calculate('*',40,3);
        calculate('/',40,4);

    }

    public static void calculate(char operator,int num1,int num2){
        switch(operator){
            case'+':
                System.out.println("Addition result is "+(num1+num2));
                break;
            case'-':
                System.out.println("Addition result is "+(num1-num2));
                break;
            case '*':
                System.out.println("Addition result is "+(num1*num2));
                break;
            case '/':
                System.out.println("Addition result is "+(num1/num2));
                break;
            default:
                System.out.println("Invalid operator");
        }

    }
}
