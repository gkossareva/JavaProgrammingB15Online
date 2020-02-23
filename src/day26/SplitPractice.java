package day26;

public class SplitPractice {
    public static void main(String[] args) {
        //2 additional String methods related to array
        //to charArray(), another is split(bySomething)

        String survey="Complete B15 Online 1 Month Survey";

        char    [] surveyChars=survey.toCharArray();
     //how do i determine to use char for each?
     //because eachh item in char array is char
        for ( char each: surveyChars){
            System.out.println("each char is: " + each);
        }
        //for loop
        for (int i = 0; i < surveyChars.length; i++) {
            System.out.println("each char is: " + surveyChars[i]);
        }
         //while loop
        int x =0;
        while(x<surveyChars.length) {
            System.out.println("each char is: " + surveyChars[x]);
            x++;
        }

        int y=0;
        do {
            System.out.println("each char is: " +surveyChars[y]);
            y++;
        }while (y<surveyChars.length);

    }
}
