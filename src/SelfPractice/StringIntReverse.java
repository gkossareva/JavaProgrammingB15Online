package SelfPractice;
//Write a return method that can reverse  String
//
//Ex: Reverse("ABCD"); ==> DCBA
public class StringIntReverse {
    public static void main(String[] args) {
        String str ="AAABBBCCCDEF";
String result="";
        for (int i = str.length()-1; i >0 ; i--) {
            result=result+str.charAt(i);
        }
        System.out.println("result = " + result);
    }
}
