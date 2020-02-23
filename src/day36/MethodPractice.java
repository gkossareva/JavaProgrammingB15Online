package day36;

public class MethodPractice {
    public static void main(String[] args) {
      Boolean result1=  chechIfStringHasNumber("ytz13ck");
        System.out.println("result1 = " + result1);
        Boolean result2=chechIfStringHasNumber("ABC");
        System.out.println("result2 = " + result2);
        System.out.println(chechIfStringHasNumber("a asj35   "));
    }
    /**write a static method to accept a String and return Boolean(Yes Uppercase) .
     it should return true if the String contains at least one number.
     *
     */




public static Boolean chechIfStringHasNumber(String str){
    for (int i = 0; i <str.length() ; i++) {
        char eachChar=str.charAt(i);
        if (Character.isDigit(eachChar)){
            return Boolean.valueOf(true);
        }
    }
    return  Boolean.valueOf(false);
}
}