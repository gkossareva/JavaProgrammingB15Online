package day12;

public class LoginTestIgnoreCase {
    public static void main(String[] args) {
        //not done yet
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
