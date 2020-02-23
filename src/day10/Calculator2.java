package day10;

public class Calculator2 {
    public static void main(String[] args) {
        //declare two number as int num1 num2 and assign value
        //declare and assign value for char variable called operator+-*/
        //according to the operator, print the result of the operation
        int num1= 20;
        int num2=10;
        char operator ='*';
        switch(operator){
            case'+':
                System.out.println(num1+num2);
                break;
            case'-':
                System.out.println(num1-num2);
                break;
            case'*':
                System.out.println(num1*num2);
                break;
            case'/':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Invalid operator!");
        }
    }
}
