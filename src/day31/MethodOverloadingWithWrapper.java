package day31;

public class MethodOverloadingWithWrapper {
    public static void main(String[] args) {
        printNum(100 );
        printNum(Integer.valueOf(100) );

    }
     public static void printNum(int x ){
      System.out.println("printing int x "+x);
    }
  public static void printNum(Integer x){
        System.out.println("printing Integer Object x "+x);


    }
}
