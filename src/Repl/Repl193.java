package Repl;
//combine two String arrays into one arraylist and return it as a string.
//
//for example:
//
//combineRs(["f","o","o"],[" b","a","r"])
//returns "foo bar"
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Repl193 {

    public static String combineRs(String[] r1, String[] r2) {
        ArrayList<String> combinedArray = new ArrayList<>(Arrays.asList(r1));
        combinedArray.addAll(Arrays.asList(r2));
//        String combinedString = "";
//        for (int i = 0; i < combinedString.size(); i++) {
//            combinedString += combinedString.get(i);
//        }

        return combinedArray.toString().replace(", ", "").replace("[", "").
                replace("]", "");



    }
}