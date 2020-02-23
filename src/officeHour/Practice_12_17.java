package officeHour;

public class Practice_12_17 {
    public static void main(String[] args) {
        //String method , nested loop
        //data type: primitive non-primitive
        //primitive: byte short int long float double char boolean
        //non-primitive: scanner String Array
int number=6;
        String word="java! ,+";
        System.out.println( word);//java

        System.out.println("word");
        System.out.println(number+6);//6+6 = 12

        System.out.println(word.length());//

        System.out.println("I have 6 "+7);

        System.out.println("I have 9"+1+2);

        System.out.println((2+3)+(3+5));
                     //0123456789012345678
        String book = "learn java in 1 day";
        System.out.println( book);
        System.out.println(book.length());
        System.out.println(book.indexOf("j"));// index 6
        System.out.println(book.lastIndexOf("j"));

        //I want only one char
        System.out.println(book.charAt(0));
        System.out.println(book.charAt(5));

        //we can use substring method to get one ore more chars

        String student="Rabia";
        System.out.println(student.substring(2));
        System.out.println(student.length());

        System.out.println(student.substring(0,1));
        System.out.println(student.substring(4));
        System.out.println(student.substring(4,5));

        System.out.println(student.toUpperCase());//RABIA
        System.out.println(student.toLowerCase());//rabia

        int i=9;
        int lengthOfStudent=student.length();
        System.out.println(lengthOfStudent);//5


        String batch="Online";
        //uppercase+length
        System.out.println(batch.toUpperCase().length());//ONLINE====>6

        System.out.println("Asiya".toUpperCase().toLowerCase().length());//5

        //trim

        String a = "  Asiya  ";

    }
}
