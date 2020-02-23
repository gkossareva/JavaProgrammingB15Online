package day19;

public class SpeedAction {
    public static void main(String[] args) {
        //create 2 int variables called start and end
        //assuming start speed is always less than end speed
        //create a for loop to stimulate slow increase of the speed
        //for e.g if start 10, end 27
        //print---> 10,11,12,13,....27

//thats how we count from 1 to 10
  //      for(int i=1 ; i<=n ; i++)
 //       {
  //          System.out.println(i+" "); // This line will print this string 10 times in 10 different lines.
 //       }
        int start = 10;
        int end=27;

        System.out.println("You have started at speed----->");
        for(int i=start; i<=end; i++){
            System.out.println(i+" ");
        }
    }
}
