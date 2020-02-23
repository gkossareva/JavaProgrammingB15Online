package day11;

public class LogicalNotOperator {
    public static void main(String[] args) {
        //logical not operator ! exlamation mark used to negate the boolen value
        System.out.println(true);
        System.out.println(false);
        System.out.println(!true);//flip the coin and make it false
        System.out.println(!false);//flip the coin and make it true
//IT CANNOT BE USED WITH ANY OTHER DATA OPERATOR BUT BOOLEAN
        boolean isRecording=false;
        System.out.println(!isRecording);

        //BOOLEAN EXPRESSION IS ANY EXPRESIION THAT RESULT IN A BOOLEAN VALUE
        //FOR EX 7>5, x>10, y==20, x <=100, x.y,x>10 &&x<100
        System.out.println("Result of  !(7>5) is ");
        System.out.println(  !(7>5));

        int x=7;
        System.out.println("Result of  (x>10) is ");
        System.out.println(  x>10);
        System.out.println("Result of  !(x>10) is ");
        System.out.println(  !(x>10));

        //!(x>10) --------> x<=10
        //create a program to check the score:ScoreChecker
        //create a variable called score assign the value of your choice if the score is
        //less than0 or more than 100----->>invalid score
        //if the score is 100----->perfect score
        //if the score is between 70-100-----> You have passed!
        //if the score

    }
}
