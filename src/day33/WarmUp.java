package day33;

public class WarmUp {
    public static void main(String[] args) {
      /*
      create getSpelledName
      this method will put dash in between given String
      for example: Akbar---->A-k-b-a-r
      @param name this is the parameter
      @return the name has dash in between
       */

        System.out.println(getSpelledName("Irina"));
        }
    public static String getSpelledName(String name){
        String result="";
        for (int i = 0; i < name.length()-1; i++) {
            //this loop will add - until right before the last character
            result=result+name.charAt(i)+"-";

            }


        return result+name.charAt(name.length()-1);
    }
}
