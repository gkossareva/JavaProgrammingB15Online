package day34;

public class LoginActivity {
    public static void main(String[] args) {
        login1 ("abc123", "user");
        login1 ("user","abc123");
        
        boolean result =login2 ("abc123", "user");
        login2 ("user","abc123");
        System.out.println("result = " + result);
        System.out.println("second run "+login2("asdfgh","dfghj"));
    }
    public static void login1 (String username, String password) {
        if (username.equals("user") && password.equals("abc123")) {
            System.out.println(" print login successful");
        } else {
            System.out.println("login failed");
        }
    }
    public static boolean login2(String username, String password){
            return username.equals("user") && password.equals("abc123");
            }
            //    return login1(username,password);
        }
//1, login1 :  static void method
//	it has two String method paramters
//			called username and password
//	(it accept 2 String object as argument when being called)
//	it check whther username and password  "user" and "abc123"
//	if yes
//		print login successful
//	else
//		print login failed (OPTIONALLY FIND EXACTLY WHY FAILED)