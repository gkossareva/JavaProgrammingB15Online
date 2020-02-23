package day12;

import java.util.Objects;

public class LoginTest {
    public static void main(String[] args) {
        //create a class called LoginTest
        // create 2 String variable called userName and password
        //and do following
        //your correct username password is user123 and pass123
        //check if your username and password correct
        //if so print login succeful
        //if not check wther your username correct
        //if not print, username is not correct
        //check your password is correct or not
        //if not print password is not correct

        String userName, password;
        userName = "user123";
        password = "pass123";
        if (userName.equals("user123") && password.equals("pass123")){
            System.out.println("Login successful");
        }
        else if (!userName.equals("user123") && password.equals("pass123")){
            System.out.println("Username is not correct");
        }
        else if(userName.equals("user123") && !password.equals("pass123")) {
            System.out.println("Password is not correct");
        }else{
            System.out.println("Username and password are incorrect");
        }
    }
}
