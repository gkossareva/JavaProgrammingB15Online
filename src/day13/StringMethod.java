package day13;

public class StringMethod {

    public static void main(String[] args) {
        //String action that we already know so far
        //equals
        String s1="HeLlo";
        System.out.println(s1.equals("abc"));
        //equalsIgnoreCase
        System.out.println(s1.equalsIgnoreCase("HELLO"));


        //toUpperCase method of String is used to make String all character uppercase
        System.out.println(  s1                  );
        System.out.println(  s1.toUpperCase()    );



        //toLowerCsse method of String is used to make String all character lowercase

        System.out.println(s1.toLowerCase() );

        //store your name into a variable
        // print your name in uppercase
        //you mmay optionally concatenate "MY NAME IS : YOUR NAME
        //PRINT YOUR name in all lowercase
        ////you mmay optionally concatenate "my name is: your name

        String myName="Galina";
        System.out.println(  myName.toUpperCase()    );
        System.out.println("MY NAME IS " +(myName.toUpperCase()));
        System.out.println(myName.toLowerCase() );
        System.out.println("my name is " +(myName.toLowerCase()) );

        System.out.println(s1.length());

        int lengthOfString=s1.length();

        if (lengthOfString >4) {
            System.out.println("More than 4 characters ");
        }else {
            System.out.println("Not more than 4");
        }
    }
}
