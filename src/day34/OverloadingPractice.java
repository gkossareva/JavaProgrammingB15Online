package day34;

public class OverloadingPractice {
    public static void main(String[] args) {
        addMethod(15);
     addMethod(15,45);
       addMethod(15,43,63);
    addMethod(15L,23L);

    }




    public static void addMethod(int a, int b){
       System.out.println(a+b);

    }
    public static void addMethod(int a){
      //  System.out.println(a+100);
        addMethod(a,100);
    }
    public static void addMethod(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void addMethod(long a, long b){
        System.out.println(a+b);
    }
}



//Create a class called OverloadingPractice
//create 4 static void overloaded version of add method
//	1, add
//		has 1 int parameter and add 100 to that number
//		and print out the result
//	2, add
//		has 2 int parameters and add them to get sum
//		and print out the result
//	3, add
//		has 3 int parameters and add them to get sum
//		and print out the result
//	4, add
//		has 2 long parameters and add them to get sum
//		and print out the result