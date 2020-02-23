package day37;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeInsert {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        List<Integer> lst2 = new ArrayList<>();
        lst2.add(44);
        lst2.add(14);
        lst2.add(34);
        lst2.add(41);
        lst2.add(19);
// insert 100 right after 34 : WE DO NOT KNOW WHERE IS 34 :

        System.out.println("lst2 = " + lst2);
        
        lst2.add(lst2.indexOf(34)+1,100);
        System.out.println("lst2 = " + lst2);

        //add five 100 in front of 44 output should look like this [100,100,100,100,100,44, 14, 34, 100, 41, 19]
        //
        for (int i = 0; i <5 ; i++) {
            lst2.add(0,100);
        }
        System.out.println("lst2 = " + lst2);
    }
}
