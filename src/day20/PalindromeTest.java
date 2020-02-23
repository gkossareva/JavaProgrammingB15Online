package day20;

public class PalindromeTest {
    public static void main(String[] args) {
        //if you reverse the string it doesnt change ----> the string is pallindrome
        //level, kayak, elle, madam, aziza
        
        String name="kayak";
        
        String reversedName="";
        
        for (int x=name.length()-1; x>=0; x--){
            reversedName=reversedName+ name.charAt(x);
        }
        System.out.println("reversedName = " + reversedName);

        // H/W
        // does not care about the space



        if(name.equalsIgnoreCase(reversedName)){
            System.out.println("Palindrome test has passed");
        }else{
            System.out.println("Palindrome test has failed");
        }
    }
    
}
