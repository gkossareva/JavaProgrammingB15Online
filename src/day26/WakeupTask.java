package day26;

import java.util.Arrays;

public class WakeupTask {
    public static void main(String[] args) {
        int[] myNumbers = new int[4];   // 4 is item count
        // we assign value using array variable and it's index
        myNumbers[0]  = 10 ;
        myNumbers[1]  = 40 ;
        myNumbers[2]  = 30 ;
        myNumbers[3]  = 7 ;
        // 1.3 I want to assign 3 item value to
        // sum of first and second item
        //1.4 swap the first item value with last item value

        System.out.println("// 1.3 I want to assign 3rd item value to \n" +
                "        // sum of first and second item ");
        int sum=myNumbers[0]+myNumbers[1];
        System.out.println("sum = " + sum);
        sum=myNumbers[2];
        System.out.println("sum = " + sum);
//myNumbers[2]=myNumbers[0]+myNumbers[1];
        System.out.println("//1.4 swap the first item value with last item value");
        int temp = myNumbers [0];
        myNumbers[0]=myNumbers[3];
        myNumbers[3]=temp;
        System.out.println(Arrays.toString(myNumbers));
    }
}
