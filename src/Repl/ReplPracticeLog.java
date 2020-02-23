package Repl;

public class ReplPracticeLog {
    public static void main(String[] args) {
        String check = "Nurses Run";
        check= check.replace(" ","");
       String reverse="";
        for (int i = check.length()-1; i >= 0; i--) {
            reverse=reverse+ check.charAt(i);
        }
        if (reverse.equalsIgnoreCase(check)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}