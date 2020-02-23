package Repl;

public class Repl74Alejandro {
    public static void main(String[] args) {
        //he wants to write a program that gets a string (the email) and determines if his name "alejandro"
        //appears in that string. if so it will output "read this mail" else it will output "dont read

        //   String a = "Hello";
        //   if (a.contains("alejandro") || a.contains("Alejandro") || a.contains("ALEJANDRO")) {
        //    System.out.println("read this mail");
        //    } else {
        //    System.out.println("dont read");


        //     }


        String email = "craig_federighi@apple.com";



/*if (email.contains("_")){
    int lastCharIndex = email.length() - 1;

    String part1Email=email.substring(0,email.indexOf("_"));
   // System.out.println("part1Email = " + part1Email);

    String part2Email=email.substring(email.indexOf('_')+1, email.indexOf('@'));
   // System.out.println("part2Email = " + part2Email);

    String part3Email=email.substring(email.indexOf('@'), lastCharIndex+1);
   // System.out.println("part3Email = " + part3Email);
            System.out.println(part2Email+"_"+part1Email+part3Email);
        }else{
            System.out.println(email);
        }*/

//Example:
//Input: craig_federighi@apple.com
//Output:
//First name: Craig
//Last name: Federighi
//Domain: apple
//Top-Level Domain: com

      //  if (email.contains("_")) {
        int lastCharIndex = email.length() - 1;

        String firstName = email.substring(0, email.indexOf("_"));
        String uppercaseName=firstName.substring(0,1).toUpperCase()+firstName.substring(1);
        System.out.println("First name: " + uppercaseName);
        String lastName = email.substring(email.indexOf('_') + 1, email.indexOf('@'));
        String upperLastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1);
        System.out.println("Last name: " + upperLastName);
        String domain = email.substring(email.indexOf('@')+1, email.indexOf('.'));
        System.out.println("Domain: " + domain);
        String TopLevelDomain = email.substring(email.indexOf('.')+1, lastCharIndex + 1);
        System.out.println("Top-Level Domain: " + TopLevelDomain);

    }
}