package SelfPractice;

public class StringTask15 {
    public static void main(String[] args) {
        //Task 15:
        //Given a String str with 3 characters:
        //for example : DEV
        //Store each character into 3 char variables
        //Store ASCII number of each character into int variables
        //hint : store char into int to get ASCII number
        //Then print it out by concatenating as below :
        //"DEV IS NOW --> D68E69V86"
        String str="Dev";

        char firstLetter='D';
        char secondLetter='E';
        char thirdLetter='V';

        int first=firstLetter;
        int second=secondLetter;
        int third=thirdLetter;

        System.out.println("first = " + first);
        System.out.println("second = " + second);
        System.out.println("third = " + third);


        System.out.println(str+" is now -----> "+firstLetter+first+secondLetter+second+thirdLetter+third);
    }
}
