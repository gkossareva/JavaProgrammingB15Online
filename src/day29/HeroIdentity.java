package day29;

public class HeroIdentity {
    public static void main(String[] args) {
        //assume that can be a different name--different length
        String hero1="Superman-Clark J Kent";

        //hide this hero identity
        //string heroX="Superman=********************
        //given a String with hero code and name separated by -
        //turn this String into hero code and * with same length as hero name

        //Plain English Logic:
        //split by dash to get the code and full name
        //get the length of full name
        //generate stars with same length as full name
        //conctenate  herocode with dash and stars and save it

       // or once the star is generated, replace full name with stars

        String [] heroSplitted=hero1.split("-");
                String heroCode=heroSplitted[0];
                        String fullNamw=heroSplitted[1];

                        int nameCharCount= fullNamw.length();
                        String stars="";
        for (int i = 0; i < nameCharCount; i++) {
            stars=stars+"*";// stars+="*";

        }
        System.out.println(fullNamw);
        System.out.println( stars);
        String heroX=heroCode+"-"+stars;
        System.out.println("hero1="+hero1);
        System.out.println("heroX="+heroX);
    }
}
