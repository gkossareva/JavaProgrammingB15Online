package Repl;
import java.util.Arrays;
import java.util.Scanner;
public class Repl28 {
    public static void main(String[] args) {
       //Create an object of Scanner class named scanner.
        //Create int variable named day.
        //Write an if statement that will print day of the week based on value of the day variable.

        Scanner scanner=new Scanner(System.in);
        int day=scanner.nextInt();
        int Monday=1;
        int Tuesday=2;
        int Wednesday=3;
        int Thursday=4;
        int Friday=5;
        int Saturday=6;
        int Sunday=7;

        if (day== 1) {
            System.out.println("It's a Monday");
        } else if (day== 2) {
            System.out.println("It's a Tuesday");
        } else if (day==3) {
            System.out.println("It's a Wednesday");
        } else if (day==4) {
            System.out.println("It's a Thursday");
        } else if (day==5) {
            System.out.println("It's a Friday");
        }else if (day==6) {
            System.out.println("It's a Sturday");
        }else if (day==7) {
            System.out.println("It's a Sunday");

    } else {
            System.out.println("There is no such a day!");
        }
    }

    public static class Repl126 {
        public static void main(String[] args) {
            //Given an array temps of doubles, containing temperature data, compute the average temperature.
            //Store the average in a variable called avgTemp.
            //Besides temps and avgTemp, you may use only two other variables -- an int variable k and a double variable named total, which have been declared.
            //Example:
            //input: 80 88 88 84 82 78 60 68
            //output: 78.5
            Scanner scan = new Scanner(System.in);
            int k = 0;
            double total = 0;
            double avgTemp = 0;
            double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                    scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

            System.out.println(Arrays.toString(temps));

            for (int i = 0; i <temps.length ; i++) {

            }
            }
        }
}



