package Repl;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class JavaExample {
    public static void main(String args[]){
        String num = "22,33,44,55,66,77";
        String str[] = num.split(",");
        List<String> al = new ArrayList<String>();
        al = Arrays.asList(str);
       // for(String s: al){
            System.out.println(al);
        }
    }
//}