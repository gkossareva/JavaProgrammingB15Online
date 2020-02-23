package officeHour;

import java.util.Arrays;

public class Practice_12_19 {
    public static void main(String[] args) {
        for (int i = 0; i <4 ; i++) {
            if (i==2)
                continue;
            System.out.println(i);
        }

        System.out.println("===============================");
        for (int i = 0; i <4 ; i++) {
            if (i==2) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Task 1" +
                "1. write a program that can check if a string is build out of the same letters as another string\n" +
                "\t\tEx: input:\n" +
                "\t\t\t\tstr1 = \"abc\";\n" +
                "\t\t\t\tstr2 = \"cba\";");
        String str1="abc", str2="cbb";
        //split(), toCharArray
char [] arr1=str1.toCharArray();    //[a,b,c]
        Arrays.sort(arr1);//[a,b,c]

        char[] arr2=str2.toCharArray();//[c,b,b]
        Arrays.sort(arr1);//[b,b,c]

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println(Arrays.equals(arr1,arr2));

        str1=Arrays.toString(arr1);
        str2=Arrays.toString(arr2);
        System.out.println(str1.equalsIgnoreCase(str2));

        System.out.println("========================");
        //task 2  Write a program that will remove all the dupplicated charasters from a string
        //				Do it withg Arrays only

        String s1="aaabbaaccbbdd";
        String s2="";//we store non duplicated characters in it

        for (int i = 0; i < s1.length(); i++) {
            String eachChar=""+s1.charAt(i);//in order conver variable to String put""
            if (!s2.contains(eachChar)){


                s2+=eachChar;
        }}
        System.out.println( s2);

        //solution 2

        String fiveMinutes="abcabc";
        String[] eachChar=fiveMinutes.split("");
        String result="";//to store all non duplicate String object of the array
        for(String each  : eachChar){
            if (!result.contains(each)){
                result+=each;
            }
        }
        System.out.println(result);

    }
}
