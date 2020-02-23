package day31;

public class Voting {
    public static void main(String[] args) {

        checkingEligibility(15);
        int yourAge=12;
        checkingEligibility(yourAge);

    }

public static void checkingEligibility(int age){
  //  int age=15;
    if (age>18){
        System.out.println("You are eligible to vote");
    }else {
        System.out.println("You are not eligible to vote");
    }

}





}



