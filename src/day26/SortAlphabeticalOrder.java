package day26;

import java.util.Arrays;

public class SortAlphabeticalOrder {
    public static void main(String[] args) {
        //2 additional String methods related to array
        //to charArray(), another is split(bySomething)

        String survey = "Complete B15 Online 1 Month Survey";
        char    [] surveyChars=survey.toCharArray();
        System.out.println("Before surveyChar"+ Arrays.toString(surveyChars));
        Arrays.sort(surveyChars);

        System.out.println("After survey.Char: "+Arrays.toString(surveyChars));
    }
}
