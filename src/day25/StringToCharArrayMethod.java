package day25;

import java.util.Arrays;

public class StringToCharArrayMethod {
    public static void main(String[] args) {
        String name = "Alesya";

        char []namesChar=new char [name.length()];
      //  namesChar[0]=name.charAt(0);
        //namesChar[1]=name.charAt(1);

        for (int x = 0; x < namesChar.length; x++) {
            namesChar[x]=name.charAt(x);
        }
        System.out.println("namesChar = " + Arrays.toString(namesChar));

        //pick up your name and use for each loop to loop over them
        //optionally count how many a you have in your name
        System.out.println("===============");
        String name1="Galina";
        int count=0;
        char[] myChar=new char[name.length()];

        for (int i = 0; i <myChar.length ; i++) {
            myChar[i] = name1.charAt(i);
            if (myChar[i] == 'a') {
                count++;
            }
        }
        System.out.println(Arrays.toString(myChar));
        System.out.println("count of 'a': "+count);


        System.out.println("================");

        for (char eachCharacter:myChar);
        System.out.println("myChar = " + myChar);

        int count1=0;
        for(char eachCharacter:myChar){
            if (eachCharacter=='a'){
                ++count;
            }
        }
        System.out.println("count1 = " + count1);
}
}