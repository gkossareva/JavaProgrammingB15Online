package officeHour;

import java.util.Arrays;

public class Practice_12_27_Part2 {
    public static void main(String[] args) {
        oddEven(100);
        System.out.println(convertKmToMiles(1));
        System.out.println(convertGallontoLiters(100));
        int[] array={2,3,1,5,10,18,19};
        descendingOrder(array);
        calculate(10, 5, "+");
        gradeCalculator(6);
    }
    public static void oddEven(int number) {
        if (number%2==0){
            System.out.println("Number is even");
        return;
        }
        System.out.println(number+" is odd number");
    }

    //1. write a method that can convert km to miles
    //	 				Hint: 1 km = 0.612 miles
    public static double convertKmToMiles(double km) {
      double miles=km*0.612;

        return miles;
    }
    //	2. write a method that can convert gallons to litters
    //	 			   Hint: 1 G = 3.75 L
    public static double convertGallontoLiters(double gallons){
        double litters=gallons*3.75;

        return litters;
    }
    //	3. write a method that can print out the array in Descending order
    public static void descendingOrder(int[] array){
        //                                [2,3,1,5]
        Arrays.sort(array);//[1,2,3,5]
        for (int i = array.length-1; i >=0 ; i--) {
            System.out.print(array[i]+" ");

        }
        System.out.println();
    }
    //4. write a method that accepts 3 parameters: 2 numbers and one operator,
    //	 	and prints out the calculation
    //		if operator is not between [-, +, *, /, %] output should be Invalid Operator
    //			Ex: calculate(10, 2, "*") ==> 20;
    //				calculate(20, 2, "~") ==> invalid operator

    public static void calculate(int a, int b, String operators){
        if (operators.equals("-")) {
            System.out.println(a - b);
        } else if (operators.equals("+"))
            System.out.println(a + b);
        else if (operators.equals("*"))
            System.out.println(a * b);
        else if (operators.equals("/"))
        System.out.println(a / b);
        else if (operators.equals("%"))
        System.out.println(a % b);
        else
        System.out.println("Invalid operator");
        }
        //5. write a method that can calculate grade
        //					if score is 100 ~ 90 ==> A
        //					if score is 89 ~ 80 ==> B
        //					if score is 79 ~ 70 ==> C
        //					if score is 69 ~ 60 ==> D
        //					if score is 0 ~ 59 ==> F
        //					otherwise ==> Invalid Score
        public static void gradeCalculator(double score) {
            if (score >= 90 && score <= 100) {
                System.out.println("Grade is A");
            } else if (score >= 80 && score <= 89) {
                System.out.println("Grade is B");
            } else if (score >= 70 && score <= 79) {
                System.out.println("Grade is C");
            } else if (score >= 60 && score <= 69) {
                System.out.println("Grade is D");
            } else if (score == 0 || score <= 59) {
                System.out.println("Grade is C");
            }
        }}





