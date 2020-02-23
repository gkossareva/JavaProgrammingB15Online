package day15;

public class ReplaceMethod {
    public static void main(String[] args) {
        //replace method of the String
        //it will go though all part of string and replace
        //any match with the string
        String message="I love pumpkin,pumpkin is fun!";

        message=message.replace("pumpkin","Java");
        System.out.println(message);

        //what if i want to replace the space from everywhere

        String message2="Happy Thanks Giving to All!!";
        //Happy Thanks Giving to All-------->>Happy Thanksgiving to All

        message2=message2.replace("Thanks Giving", "Thanksgiving");
        System.out.println("message2 = " + message2);

        message2=message2.replace("!!", "!");
        System.out.println("message2 = " + message2);
        //what if i want to have 1! not 2!!

        //replace all the spaces
        message2=message2.replace(" ","");
        System.out.println("message2 = " + message2);

            String message3="Tomorrow is off no";
            //how do we remove no
        System.out.println(message3.replace("no"," "));

    }
}
