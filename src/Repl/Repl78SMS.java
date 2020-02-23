package Repl;
import java.util.*;
public class Repl78SMS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your message");
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;
//Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}
        sender=message.substring(message.indexOf("<")+1, message.indexOf(">"));
        System.out.println("Sender: "+sender);
        phoneNumber=message.substring(message.indexOf("[")+1,message.indexOf("]"));
        System.out.println("Phone Number: "+phoneNumber);
        messageBody=message.substring(message.indexOf("{")+1,message.indexOf("}"));
        System.out.println("Message body: "+messageBody);
    }
}
