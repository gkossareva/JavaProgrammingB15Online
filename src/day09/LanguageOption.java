package day09;

import jdk.swing.interop.SwingInterOpUtils;

public class LanguageOption {
    public static void main(String[] args) {
        /*assume you are on the call and you have been given option to be greeted by the lang of your choice according to the number you provided
        1---->Hello
        2---->Salam
        3. Hola
        4----->Privet
        5 ----> Merhaba
        6----->Szia
        7----->Bonjour

        The program should set the value of a String variable called greeting
        To this value:1---->"Hello, SDET"

        Print out */
        System.out.println("Welcome to Cybertek Call Center");
        System.out.println("Please select your language");
        int languageOption = 11;
        String greeting = ""; //assigning an empty value
        if (languageOption == 1) {
            greeting = "Salam";
        } else if
        (languageOption == 2) {
            greeting = "Hola";
        } else if (languageOption== 3) {
            greeting = "Privet";
        } else if (languageOption == 4) {
            greeting = "Merhaba";
        } else if (languageOption == 5) {
            greeting = "Szia";
        } else if (languageOption == 6) {
            greeting = "Bonjur";
        } else if (languageOption == 7) {
            greeting = "Guten Tag";
        }
        else {
            System.out.println("Unknown");
        }
        greeting=greeting+", SDET";
        System.out.println(greeting);

        System.out.println("This is how you can see the message ");
    }
    //System.out.println("Wrong number");
}

