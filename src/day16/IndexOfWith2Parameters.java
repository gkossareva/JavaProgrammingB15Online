package day16;

public class IndexOfWith2Parameters {
    public static void main(String[] args) {
       //               01234567890123456789012345
       // String name ="I love Java Java Java Java";
        //get the second java from the sentencw
        //assume you already know there is 4 java in this sentence
        //second java means---> the java showed up after first java

        //first find out where is the loccation of the first java showed up
        //in order to find the second one,
        //instead of searching from the begining , search from right after the location you found 1st Java
        //then it will give you the index of scond java

        //but how do i start from different location when using indexof
        //because index of always start from the begining

        //indexOf method has 2 versions 1 expect 1 external data
        //another expect 2 external data--->yourString.index();


        //another
        //              01234567890123456789012345
        String name ="I love Java I love Java Java Java";
        System.out.println( "Java starting from 0 "+name.indexOf("Java"));
        System.out.println( "Java starting from 7 "+name.indexOf("Java", 7));
        System.out.println( "Java starting from 8 "+name.indexOf("Java", 8));
        System.out.println("Java starting from 9 "+ name.indexOf("Java", 9));
        System.out.println( "Java starting from 19 "+name.indexOf("Java", 19));
        System.out.println("Java starting from 20 "+ name.indexOf("Java", 20));

        //how do i start from the location that get past first java
        //basically starting point different that 0 so that it gets past first java

        int firstJavaLocation=name.indexOf("Java");//location of 1st java in this case 7
        //starting point can be right after the1st character of the word
        //or you can start here+4
        //or you can start right after you finish the word yo are searching, for the word java+4
        //if we dont know the length of the word-----+word.length();
        int startingPointToSearchSecondJava= firstJavaLocation+1;//or you can start here +4
        int secondJavaLocation= name.indexOf("Java", startingPointToSearchSecondJava);
        System.out.println("secondJavaLocation =  " + secondJavaLocation);

        //i dont know how many words in this sentence but i want know what is the second word. i only know 3+ words
        //and there is only one space in between words
        //from the 1st space till the 2nd space
        int firstSpaceLocation=name.indexOf(" ");
        int secondSpaceLocation=name.indexOf(" ",firstSpaceLocation+1);
        System.out.println("Second word in this sentence is "+name.substring(firstSpaceLocation+1,secondSpaceLocation));
    }
}
