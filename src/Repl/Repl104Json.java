package Repl;

import java.util.Scanner;

public class Repl104Json {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String json = scan.nextLine();
//Example:
//input:{"id": 1934, "firstName": "James", "lastName": "May", "role": "student-team-member"}
//output:
//First name: James
//Last name: May

        String firstName = json.substring(json.indexOf("firstName") + 13, json.indexOf("\","));
        String lastName = json.substring(json.indexOf("lastName") + 12, json.indexOf("role") - 4);

        System.out.println("First name: "+firstName);
        System.out.println("Last name: "+lastName);
    }
}
