package day26;

public class ArrayTask_NumberTest {
    public static void main(String[] args) {
        // 1, given an int array
        // write a program to test all the element in an int array more that 100
int [] scores = {156,101,76,187,87,110};

//create a variable caled finalResult to store
        //your resul of checking if every number in this array is more than 100 or not

        String finalResult=""; //if all numbers are more than 100 then make it yes, if not make it no
//logic 1 take each item check if it is less than 100, count. in the end if count is more than 0, answer is NO,
        int cntLessThan100=0;
        for (   int eachNumber   :  scores) {
            if (eachNumber<= 100) {
                cntLessThan100++;
                System.out.println("eachNumber = " + eachNumber);


            }

        }
        System.out.println("cntLessThan100: " + cntLessThan100);

        if (cntLessThan100>0){
            finalResult="No";
        } else{
            finalResult="Yes";
        }
        System.out.println("finalResult "+finalResult);
//  LOGIC 2 VHECK EACH ITEM AND THEN break when number is less than hundered After assigning final result to no
        //LOGIC3 minus 100 from all numbers in array and if any of the numbers are negative, it will be a NO
        //LOGIC4 find min number if min number more than 100 yes

    }
}
