package day14;

public class EmailChecker {
    public static void main(String[] args) {
        //create a variable called email
        /*check for beliow conditions
                if it does not contain character @ say invalid email
                if it contains space say invalid email
                if it contains space say invalid email

                if it endsWith @gmail.com ---> gmail
                if it endsWith @yahoo.com----->yahoo email
                if it endsWith @mail.ru----->Russian email
                */

        String email="taccolinka@gmail.ru";
        if (!email.contains("@") || email.contains(" ")){
            System.out.println("Invalid email");

        }else if (email.endsWith("@gmail.com")){
            System.out.println("Googlse mail");

        }else if (email.endsWith("@yahoo.com")){
            System.out.println("YAHOO");

        }else if (email.endsWith("@mail.ru")){
            System.out.println("russian email");

        }else{
            System.out.println("Unknown domain");
        }
    }
}