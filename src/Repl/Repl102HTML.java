package Repl;

import java.util.Scanner;

public class Repl102HTML {
    public static void main(String[] args) {
        //Example:
        //input: <!DOCTYPE html><html><head><title>Java</title></head><body><p id="myid"></p></body></html>
        //output: myid
        Scanner scan = new Scanner(System.in);
        String html = scan.nextLine();
     //   for (int i = 0; i < html.length(); i++) {
            if (!html.contains("<html>")){
                 //break;
                System.out.println("Invalid input!");
            }else{
                System.out.println(html.substring(html.indexOf("id")+4,html.lastIndexOf('"')));
            }
        }
    }
//