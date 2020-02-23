package day21;

public class LoopControlStatement {
    public static void main(String[] args) {
        //break
        //if line contains break reaches, the loop will stop!
//task 1
   //     for (int i=1; i<=10; i++) {
     //       System.out.println(i);
       //     break;
      //  }
        // while iterating over 1 to 10
        //break out of the loop when it is 5

 //       for (int i=1; i<=10; i++) {
//            System.out.println(i);
  //          if (i==5){
    //            break;
      //      }
        //we need to check the sum after we make sure it didmt go over 40
        //}
        //i want to add money to my bank acount from day 1 till day 10
        //day 1 add 1$
        //day 2 I add 2 $
        //day 3 I add 3 $
        //....
       // day 10 I add 10 $
        // however my bank account can only hold 40$
            //so i need to stop  adding money the moment i realize it cannot hold
        //the money im about to put if the sum would go over40

 int sum=0;
        for (int x=1; x<=10; x++) {

            System.out.println("current sum is "+sum);
            System.out.println(" if I add "+ x+ " dollar, it would be "+ (sum+x));
            if(sum> 12){
                break;


            }
            //we need to check the sum after we make sure it didmt go over 40
            sum=sum+x;
        }
        System.out.println("sum = "+sum);

    }


}
