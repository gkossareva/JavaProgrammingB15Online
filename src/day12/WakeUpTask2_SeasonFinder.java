package day12;

public class WakeUpTask2_SeasonFinder {
    public static void main(String[] args) {
        /*create a class SeasonFinder

        Create a variable called month with data type int
        and write an if else else statement to do following
if the month is less than 1 or more than 12 ---->Invalid Number
 if the month is between 3-5 print it's spring
 if the month is between 6-8 print its summer
 if the month is between 9-11 print it's fall
 if the month is 12,1,2 print it's winter


         */
        int month=11;

        if (month<1 || month>12){
            System.out.println("Invalid Number");
        }else if (month>=3 && month<=5){
            System.out.println("It's spring");
        }else if (month>=6 && month<=8){
            System.out.println("It;s summer");
        }else if (month>=9 && month<=11){
            System.out.println("It's fall");
        }else if (month==12 || month==1 || month==2) {
            System.out.println("It's winter");
            //since first condtion is already taking out
            // invalid situation, we dont need else in this condition
            // else in general is optional
        }
    }
}
