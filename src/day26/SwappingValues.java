package day26;

import java.util.Arrays;

public class SwappingValues {
    public static void main(String[] args) {
        int[] myNumbers = new int[4];   // 4 is item count
        // we assign value using array variable and it's index
        myNumbers[0]  = 10 ;
        myNumbers[1]  = 40 ;
        myNumbers[2]  = 30 ;
        myNumbers[3]  = 7 ;
        System.out.println("//1.4 swap the first item value with last item value");
        int temp = myNumbers [0];
        myNumbers[0]=myNumbers[3];
        myNumbers[3]=temp;
        System.out.println(Arrays.toString(myNumbers));

        String name1="Emma";
        String name2="Jason";

       // name1=name2;
        //name2=name1;
        String tempContainer=name1;//emma
        name1=name2;//name1-----> Jason
        name2=tempContainer;//name--->Emma
        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);

        //1.4 swap the first item value with last item value"
        int[] myNumbers2=new int[] {10,40,30,7};
        int temp2=myNumbers2[0];//temp is 10 now
  myNumbers2[0]=myNumbers2[3];//first item value become 7
  myNumbers2[3]=temp;
        System.out.println("myNumbers2[0]= " + myNumbers2[0]);
        System.out.println("last item="+myNumbers2[3]);
    }


}
