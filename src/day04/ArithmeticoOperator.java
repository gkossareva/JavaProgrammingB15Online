package day04;

public class ArithmeticoOperator {
    public static void main(String[] args) {
        //int arithmetical operator between two int ---->> another int

        System.out.println(5+3);//8
        System.out.println(5-3);//2
        System.out.println(5*3);//15
        System.out.println(5/3);//1
        // arithmetic operator between two numerical data type
        // the final result will be larger data type
        System.out.println(5+3.0d);
        System.out.println(5-3.0d);
        System.out.println(5*3.0d);
        System.out.println(5/3.0d);//1
        System.out.println(5/3.0f);//1



        //store above number in variables
        //and replace above statement with variables instead
        //data type result1=the calculation here
        //System.out.println(result1);
        int numberOne =5;
        double numberTwo =3.0d;
        float numberThree=3.0f;
        double result1 = numberOne + numberTwo;
        double result2 =numberOne -numberTwo;
        double result3 = numberOne * numberTwo;
        double result4 = numberOne/ numberTwo;
        float result5 = numberOne/ numberThree;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}
