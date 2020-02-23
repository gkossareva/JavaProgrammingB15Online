package officeHour;

public class Practice_12_2StringReview {
    public static void main(String[] args) {
//                   012345678901234567890123456
        String item="Echo Show (5th Generation) Characoal";
//get whatever is inside paranthesis()
        //find out index of (and index of), use them substring to get the text

        System.out.println(item.substring(9,18));
        System.out.println(item.substring(10,17));

        int indexOfOpeningParanthesis=item.indexOf("(");
        int indexOfEndParanthesis=item.indexOf(")");


        String wordInsideParathesis=item.substring(indexOfOpeningParanthesis+1 , indexOfEndParanthesis);
        System.out.println("wordInsideParathesis = " + wordInsideParathesis);

        String letters="J%a^V*****$a";
        System.out.println("letters before = " + letters);
        //remove% ^*1$(

        letters=letters.replace("%","")
                .replace("^","")
                .replace("*","")
                .replace("$","")
                .toUpperCase();

        System.out.println("letters = " + letters);

        //i you want to replace first one use replaceFirst


    }
}
