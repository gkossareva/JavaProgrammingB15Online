package day33;
////create a class ReturnKeyWordPractice
//    // write a method accept a birth year and return the age
//    //the birth year should be within the rage 1900-2020
//    //if  not retyrn 0

public class ReturnKeyWordPractice {
    public static void main(String[] args) {

        System.out.println(calculateAgeFromBirthYear(1987));
    }
    public static int calculateAgeFromBirthYear(int birthYear){
     // Scanner scan=new Scanner(System.in);
       // System.out.println("Enter birth year");
        //int birthYear=scan.nextInt();

       // int age=2020-birthYear;
        if (birthYear<=1900 || birthYear>2020){
            return 0;
        }
        return 2019-birthYear;
       // return calculateAgeFromBirthYear(birthYear);
    }
}


