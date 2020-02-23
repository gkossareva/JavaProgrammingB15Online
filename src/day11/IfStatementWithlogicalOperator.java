package day11;

public class IfStatementWithlogicalOperator {
    public static void main(String[] args) {
        //create a program to check the score:ScoreChecker
        //create a variable called score assign the value of your choice if the score is
        //less than0 or more than 100----->>Invalid score
        //if the score is 100----->Perfect score
        //if the score is between 70-100-----> You have passed!
        //else----->You have failed
         int score=88;
        if (score<0 || score>100){
            System.out.println("Invalid Score!");
        } else if(score==100){
            System.out.println("Perfect Score!");
        }else if(score>70 && score<100){
            System.out.println("You have passed!");
        }else if(score<20) {
            System.out.println("Come to my office!");
        }else if(score<40 && score>30) {
            System.out.println("Attend additional classes!");
        } else {
            System.out.println("You have failed!!");
        }



    }
}
