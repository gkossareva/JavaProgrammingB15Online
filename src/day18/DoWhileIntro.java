package day18;

public class DoWhileIntro {
    public static void main(String[] args) {
        //count from 1 to 5
   //     do{
//take some action here
  //      }while (some condition is true)
        int x=1;
        do{
            System.out.println(x);
            ++x;
        }while (x<=5);//; mandotory
        System.out.println("--------");
        int y= 5;

        do{
            System.out.println(y);
            --y;
        }while (y>0);

        //while loop vs do while loop
        //while loop checks the condition 1st then enter the statement
        //do while loop takes the action at least once then checks the condition

        //do while loop always run at least one itteration
        //while loop might not ever run
    }
}
